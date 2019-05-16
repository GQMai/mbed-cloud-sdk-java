// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.annotations.Required;
import com.arm.mbed.cloud.sdk.common.SdkContext;

/**
 * Factory for SDK modules.
 * <p>
 * Utility for fetching {@link com.arm.mbed.cloud.sdk.annotations.Module}
 */
@Preamble(description = "Factory for SDK modules.")
@Internal
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class ModuleFactory implements Cloneable {
    /**
     * Context.
     */
    @Internal
    @Required
    private final SdkContext context;

    /**
     * Connect.
     */
    @Internal
    @Required
    private final Connect connectModule;

    /**
     * Constructor.
     *
     * <p>
     * Constructor based on all fields.
     * <p>
     *
     * @param context
     *            Context.
     * @param connectModule
     *            Connect.
     */
    public ModuleFactory(SdkContext context, Connect connectModule) {
        super();
        this.context = context;
        this.connectModule = connectModule;
    }

    /**
     * Constructor.
     */
    public ModuleFactory() {
        this((SdkContext) null, (Connect) null);
    }

    /**
     * Constructor.
     *
     * <p>
     * Constructor based on a similar object.
     * <p>
     *
     * @param moduleFactory
     *            a module factory.
     */
    public ModuleFactory(ModuleFactory moduleFactory) {
        this(moduleFactory == null ? (SdkContext) null : moduleFactory.context,
             moduleFactory == null ? (Connect) null : moduleFactory.connectModule);
    }

    /**
     * Method to ensure {@link #equals(Object)} is correct.
     *
     * <p>
     * Note: see this article: <a href="https://www.artima.com/lejava/articles/equality.html">canEqual()</a>
     * 
     * @param other
     *            another object.
     * @return true if the other object is an instance of the class in which canEqual is (re)defined, false otherwise.
     */
    protected boolean canEqual(Object other) {
        return other instanceof ModuleFactory;
    }

    /**
     * Clones this instance.
     *
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public ModuleFactory clone() {
        return new ModuleFactory(this);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * <p>
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     * @param obj
     *            an object to compare with this instance.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ModuleFactory)) {
            return false;
        }
        final ModuleFactory other = (ModuleFactory) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (context == null) {
            if (other.context != null) {
                return false;
            }
        } else if (!context.equals(other.context)) {
            return false;
        }
        if (connectModule == null) {
            if (other.connectModule != null) {
                return false;
            }
        } else if (!connectModule.equals(other.connectModule)) {
            return false;
        }
        return true;
    }

    /**
     * Gets an accounts.
     * 
     * @return an accounts
     */
    @SuppressWarnings("resource")
    public Accounts getAccounts() {
        return new Accounts(context);
    }

    /**
     * Gets a billing.
     * 
     * @return a billing
     */
    @SuppressWarnings("resource")
    public Billing getBilling() {
        return new Billing(context);
    }

    /**
     * Gets connect.
     * 
     * @return connectModule
     */
    @Internal
    public Connect getConnectModule() {
        return connectModule;
    }

    /**
     * Gets context.
     * 
     * @return context
     */
    @Internal
    public SdkContext getContext() {
        return context;
    }

    /**
     * Gets a device update.
     * 
     * @return a device update
     */
    @SuppressWarnings("resource")
    public DeviceUpdate getDeviceUpdate() {
        return new DeviceUpdate(context);
    }

    /**
     * Gets a devices.
     * 
     * @return a devices
     */
    @SuppressWarnings("resource")
    public Devices getDevices() {
        return new Devices(context);
    }

    /**
     * Gets a security.
     * 
     * @return a security
     */
    @SuppressWarnings("resource")
    public Security getSecurity() {
        return new Security(context);
    }

    /**
     * Calculates the hash code of this instance based on field values.
     *
     * <p>
     * 
     * @see java.lang.Object#hashCode()
     * @return hash code
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((context == null) ? 0 : context.hashCode());
        result = prime * result + ((connectModule == null) ? 0 : connectModule.hashCode());
        return result;
    }

    /**
     * Returns a string representation of the object.
     *
     * <p>
     * 
     * @see java.lang.Object#toString()
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ModuleFactory [context=" + context + ", connectModule=" + connectModule + "]";
    }
}