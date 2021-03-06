package com.arm.mbed.cloud.sdk.subscribe.store;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.CallbackWithException;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.UuidGenerator;
import com.arm.mbed.cloud.sdk.common.listing.FilterOptions;
import com.arm.mbed.cloud.sdk.connect.model.Resource;
import com.arm.mbed.cloud.sdk.subscribe.NotificationMessage;
import com.arm.mbed.cloud.sdk.subscribe.NotificationMessageValue;
import com.arm.mbed.cloud.sdk.subscribe.Observer;
import com.arm.mbed.cloud.sdk.subscribe.SubscriptionManager;
import com.arm.mbed.cloud.sdk.subscribe.SubscriptionType;

@Preamble(description = "Abstract store for subscription observers")
@Internal
public abstract class AbstractSubscriptionObserverStore<T extends NotificationMessageValue>
                                                       implements SubscriptionManager {
    private final SubscriptionEmitterStore<T> emitterStore;
    private static final int STORE_INITIAL_CAPACITY = 10;
    private final ConcurrentMap<String, Observer<T>> observerStore;
    private final SubscriptionType type;
    private final Scheduler scheduler;
    private final WeakReference<SubscriptionManager> parentManager;

    /**
     * Constructor.
     *
     * @param type
     *            type of subscription.
     * @param scheduler
     *            scheduler to use for notification consumption.
     * @param parent
     *            parent manager
     */
    public AbstractSubscriptionObserverStore(SubscriptionType type, Scheduler scheduler,
                                             WeakReference<SubscriptionManager> parent) {
        super();
        this.type = type;
        emitterStore = new SubscriptionEmitterStore<>();
        observerStore = new ConcurrentHashMap<>(STORE_INITIAL_CAPACITY);
        this.scheduler = scheduler;
        this.parentManager = parent;
    }

    @Override
    public @Nullable List<Observer<?>> listAll() {
        return observerStore.isEmpty() ? null
                                       : Arrays.asList(observerStore.values()
                                                                    .toArray(new Observer<?>[observerStore.values()
                                                                                                          .size()]));
    }

    @Override
    public @Nullable List<Observer<?>> listAll(@NonNull SubscriptionType subscriptionType) {
        if (subscriptionType == null || subscriptionType != this.type) {
            return null;
        }
        return listAll();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.arm.mbed.cloud.sdk.subscribe.SubscriptionManager#completeAll()
     */
    @Override
    public void completeAll() {
        emitterStore.completeAll();

    }

    /*
     * (non-Javadoc)
     *
     * @see com.arm.mbed.cloud.sdk.subscribe.SubscriptionManager#completeAll(com.arm.mbed.cloud.sdk.subscribe.
     * SubscriptionType)
     */
    @Override
    public void completeAll(SubscriptionType subscriptionType) {
        if (subscriptionType == null || subscriptionType != this.type) {
            return;
        }
        completeAll();
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.arm.mbed.cloud.sdk.subscribe.SubscriptionManager#complete(com.arm.mbed.cloud.sdk.subscribe.SubscriptionType,
     * java.lang.String)
     */
    @Override
    public void complete(SubscriptionType subscriptionType, String observerId) {
        if (subscriptionType == null || subscriptionType != this.type || observerId == null) {
            return;
        }
        emitterStore.complete(observerId);
    }

    @Override
    public void unsubscribeAll() {
        completeAll();
        emitterStore.clear();
        observerStore.clear();
    }

    @Override
    public void unsubscribeAll(SubscriptionType subscriptionType) {
        if (subscriptionType == null || subscriptionType != this.type) {
            return;
        }
        unsubscribeAll();
    }

    @Override
    public void unsubscribe(SubscriptionType subscriptionType, String observerId) {
        if (subscriptionType == null || subscriptionType != this.type || observerId == null) {
            return;
        }
        complete(subscriptionType, observerId);
        emitterStore.removeSubscriptionChannel(observerId);
        observerStore.remove(observerId);
    }

    @Override
    public void unsubscribe(Observer<?> observer) {
        if (observer == null) {
            return;
        }
        unsubscribe(observer.getSubscriptionType(), observer.getId());
    }

    @Override
    public Scheduler getObservedOnExecutor() {
        return scheduler;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <U extends NotificationMessageValue> void notify(SubscriptionType subscriptionType, String channelId,
                                                            NotificationMessage<U> message) throws MbedCloudException {
        if (subscriptionType == null || subscriptionType != this.type || message == null) {
            return;
        }
        try {
            emitterStore.handleNotification(channelId, (T) message.getValue(), message.getException());
        } catch (@SuppressWarnings("unused") ClassCastException exception) {
            // Nothing to do;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.arm.mbed.cloud.sdk.subscribe.SubscriptionManager#notify(com.arm.mbed.cloud.sdk.subscribe.SubscriptionType,
     * com.arm.mbed.cloud.sdk.subscribe.NotificationMessageValue)
     */
    @Override
    public <U extends NotificationMessageValue> void notify(SubscriptionType subscriptionType,
                                                            U value) throws MbedCloudException {
        notify(subscriptionType, new NotificationMessage<>(value, null));
    }

    @SuppressWarnings("unchecked")
    @Override
    public <U extends NotificationMessageValue> void notify(SubscriptionType subscriptionType,
                                                            NotificationMessage<U> message) throws MbedCloudException {
        if (subscriptionType == null || subscriptionType != this.type) {
            return;
        }
        try {
            emitterStore.handleNotification((T) message.getValue(), message.getException());
        } catch (@SuppressWarnings("unused") ClassCastException exception) {
            // Nothing to do;
        }
    }

    @Override
    public @Nullable Observer<?> createObserver(SubscriptionType subscriptionType, FilterOptions filter,
                                                BackpressureStrategy strategy) {
        return createObserver(subscriptionType, filter, strategy, null, null);
    }

    @Override
    public @Nullable Observer<?>
           createObserver(SubscriptionType subscriptionType, FilterOptions filter, BackpressureStrategy strategy,
                          CallbackWithException<FilterOptions, MbedCloudException> actionOnSubscription,
                          CallbackWithException<FilterOptions, MbedCloudException> actionOnUnsubscription) {
        return createObserver(subscriptionType, filter, strategy, actionOnSubscription, actionOnUnsubscription, false,
                              null);
    }

    @SuppressWarnings("unchecked")
    @Override
    public @Nullable Observer<?>
           createObserver(SubscriptionType subscriptionType, FilterOptions filter, BackpressureStrategy strategy,
                          CallbackWithException<FilterOptions, MbedCloudException> actionOnSubscription,
                          CallbackWithException<FilterOptions, MbedCloudException> actionOnUnsubscription,
                          boolean notifyOtherObservers, Resource correspondingResource) {
        if (subscriptionType == null || subscriptionType != this.type) {
            return null;
        }
        final String channelId = this.type.toString() + UuidGenerator.generate();
        final Flowable<T> flow = emitterStore.createSubscriptionChannel(channelId, strategy);
        final Observer<?> obs = buildObserver(channelId, flow, filter, actionOnSubscription, actionOnUnsubscription,
                                              notifyOtherObservers, correspondingResource);
        storeObserver((Observer<T>) obs);
        return obs;
    }

    private void storeObserver(Observer<T> observer) {
        if (observer == null) {
            return;
        }
        observerStore.put(observer.getId(), observer);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.arm.mbed.cloud.sdk.subscribe.SubscriptionManager#hasObservers()
     */
    @Override
    public boolean hasObservers() {
        return !observerStore.isEmpty();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.arm.mbed.cloud.sdk.subscribe.SubscriptionManager#hasObservers(com.arm.mbed.cloud.sdk.subscribe.
     * SubscriptionType)
     */
    @Override
    public boolean hasObservers(SubscriptionType subscriptionType) {
        if (subscriptionType == null || subscriptionType != this.type) {
            return false;
        }
        return hasObservers();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.arm.mbed.cloud.sdk.subscribe.SubscriptionManager#hasObserver(com.arm.mbed.cloud.sdk.subscribe.
     * SubscriptionType, java.lang.String)
     */
    @Override
    public boolean hasObserver(SubscriptionType subscriptionType, String observerId) {
        if (subscriptionType == null || subscriptionType != this.type) {
            return false;
        }
        return observerStore.containsKey(observerId);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.arm.mbed.cloud.sdk.subscribe.SubscriptionManager#hasObserver(com.arm.mbed.cloud.sdk.subscribe.Observer)
     */
    @Override
    public boolean hasObserver(Observer<?> observer) {
        if (observer == null) {
            return false;
        }
        return hasObserver(observer.getSubscriptionType(), observer.getId());
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "AbstractSubscriptionObserverStore [type=" + type + "]";
    }

    /*
     * (non-Javadoc)
     *
     * @see com.arm.mbed.cloud.sdk.subscribe.SubscriptionManager#getTopManager()
     */
    @Override
    public SubscriptionManager getTopManager() {
        SubscriptionManager manager = this.parentManager == null ? null : this.parentManager.get();
        while (manager != null && manager.getTopManager() != null) {
            manager = manager.getTopManager();
        }
        return manager;
    }

    protected abstract Observer<?>
              buildObserver(String channelId, Flowable<T> flow, FilterOptions filter,
                            CallbackWithException<FilterOptions, MbedCloudException> actionOnSubscription,
                            CallbackWithException<FilterOptions, MbedCloudException> actionOnUnsubscription,
                            boolean notifyOtherObservers, Resource correspondingResource);

}
