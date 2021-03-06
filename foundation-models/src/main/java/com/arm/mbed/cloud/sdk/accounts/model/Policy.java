// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.PerformsNoOperation;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.Objects;

/**
 * Model for a policy.
 */
@Preamble(description = "Model for a policy.")
public class Policy implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -169110117416151L;

    /**
     * Comma-separated list of actions, empty string represents all actions.
     */
    private final String action;

    /**
     * True or false controlling whether an action is allowed or not.
     */
    private final boolean allow;

    /**
     * Feature name corresponding to this policy.
     */
    private final String feature;

    /**
     * Flag indicating whether this feature is inherited or overwritten specifically.
     */
    private final boolean inherited;

    /**
     * An ID indicating where this policy is inherited from.
     */
    private final String inheritedFrom;

    /**
     * Indicates the type of entity this policy is inherited from.
     */
    private final PolicyInheritedType inheritedType;

    /**
     * Resource that is protected by this policy.
     */
    private final String resource;

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #Policy()} instead.
     * 
     * @param action
     *            Comma-separated list of actions, empty string represents all actions.
     * @param allow
     *            True or false controlling whether an action is allowed or not.
     * @param feature
     *            Feature name corresponding to this policy.
     * @param inherited
     *            Flag indicating whether this feature is inherited or overwritten specifically.
     * @param inheritedFrom
     *            An ID indicating where this policy is inherited from.
     * @param inheritedType
     *            Indicates the type of entity this policy is inherited from.
     * @param resource
     *            Resource that is protected by this policy.
     */
    @Internal
    public Policy(String action, boolean allow, String feature, boolean inherited, String inheritedFrom,
                  PolicyInheritedType inheritedType, String resource) {
        super();
        this.action = action;
        this.allow = allow;
        this.feature = feature;
        this.inherited = inherited;
        this.inheritedFrom = inheritedFrom;
        this.inheritedType = inheritedType;
        this.resource = resource;
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on a similar object.
     * <p>
     * Note: Should not be used. Use {@link #Policy()} instead.
     * 
     * @param policy
     *            a policy.
     */
    @Internal
    public Policy(Policy policy) {
        this(policy == null ? (String) null : policy.action, policy != null && policy.allow,
             policy == null ? (String) null : policy.feature, policy != null && policy.inherited,
             policy == null ? (String) null : policy.inheritedFrom,
             policy == null ? PolicyInheritedType.getDefault() : policy.inheritedType,
             policy == null ? (String) null : policy.resource);
    }

    /**
     * Constructor.
     */
    public Policy() {
        this((String) null, false, (String) null, false, (String) null, PolicyInheritedType.getDefault(),
             (String) null);
    }

    /**
     * Sets id.
     * 
     * @param id
     *            id.
     */
    @Override
    @Internal
    @PerformsNoOperation
    public void setId(String id) {
        // Nothing to do
    }

    /**
     * Gets id.
     * 
     * <p>
     * Warning: Policy model does not have any ID field. This always returns {@code null}.
     * 
     * @return id
     */
    @Override
    @Internal
    public String getId() {
        return null;
    }

    /**
     * Gets comma-separated list of actions, empty string represents all actions.
     * 
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * Gets true or false controlling whether an action is allowed or not.
     * 
     * @return allow
     */
    public boolean isAllow() {
        return allow;
    }

    /**
     * Gets feature name corresponding to this policy.
     * 
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    /**
     * Gets flag indicating whether this feature is inherited or overwritten specifically.
     * 
     * @return inherited
     */
    public boolean isInherited() {
        return inherited;
    }

    /**
     * Gets an id indicating where this policy is inherited from.
     * 
     * @return inheritedFrom
     */
    public String getInheritedFrom() {
        return inheritedFrom;
    }

    /**
     * Gets indicates the type of entity this policy is inherited from.
     * 
     * @return inheritedType
     */
    public PolicyInheritedType getInheritedType() {
        return inheritedType;
    }

    /**
     * Gets resource that is protected by this policy.
     * 
     * @return resource
     */
    public String getResource() {
        return resource;
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
        return "Policy [action=" + action + ", allow=" + allow + ", feature=" + feature + ", inherited=" + inherited
               + ", inheritedFrom=" + inheritedFrom + ", inheritedType=" + inheritedType + ", resource=" + resource
               + "]";
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
        result = prime * result + ((action == null) ? 0 : action.hashCode());
        result = prime * result + Objects.hashCode(Boolean.valueOf(allow));
        result = prime * result + ((feature == null) ? 0 : feature.hashCode());
        result = prime * result + Objects.hashCode(Boolean.valueOf(inherited));
        result = prime * result + ((inheritedFrom == null) ? 0 : inheritedFrom.hashCode());
        result = prime * result + ((inheritedType == null) ? 0 : inheritedType.hashCode());
        result = prime * result + ((resource == null) ? 0 : resource.hashCode());
        return result;
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
        return other instanceof Policy;
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
        if (!(obj instanceof Policy)) {
            return false;
        }
        final Policy other = (Policy) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (action == null) {
            if (other.action != null) {
                return false;
            }
        } else if (!action.equals(other.action)) {
            return false;
        }
        if (allow != other.allow) {
            return false;
        }
        if (feature == null) {
            if (other.feature != null) {
                return false;
            }
        } else if (!feature.equals(other.feature)) {
            return false;
        }
        if (inherited != other.inherited) {
            return false;
        }
        if (inheritedFrom == null) {
            if (other.inheritedFrom != null) {
                return false;
            }
        } else if (!inheritedFrom.equals(other.inheritedFrom)) {
            return false;
        }
        if (inheritedType != other.inheritedType) {
            return false;
        }
        if (resource == null) {
            if (other.resource != null) {
                return false;
            }
        } else if (!resource.equals(other.resource)) {
            return false;
        }
        return true;
    }

    /**
     * Checks whether the model is valid or not.
     * 
     * <p>
     * 
     * @see SdkModel#isValid()
     * @return true if the model is valid; false otherwise.
     */
    @Override
    public boolean isValid() {
        return true;
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
    public Policy clone() {
        return new Policy(this);
    }
}
