// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Thu Dec 27 16:49:07 GMT 2018. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;

/**
 * Model for a password policy.
 */
@Preamble(description = "Model for a password policy.")
public class PasswordPolicy extends AbstractPasswordPolicy {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = -141408703516119L;

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #PasswordPolicy()} instead.
     * 
     * @param minimumLength
     *            Minimum length for the password. A number between 8 and 512.
     */
    @Internal
    public PasswordPolicy(String minimumLength) {
        super(minimumLength);
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #PasswordPolicy()} instead.
     * 
     * @param passwordPolicy
     *            a password policy.
     */
    @Internal
    public PasswordPolicy(PasswordPolicy passwordPolicy) {
        this(passwordPolicy == null ? (String) null : passwordPolicy.minimumLength);
    }

    /**
     * Constructor.
     */
    public PasswordPolicy() {
        this((String) null);
    }

    /**
     * @return something
     */
    @Override
    public String getId() throws NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * @param id
     *            a string.
     */
    @Override
    public void setId(String id) throws NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
    }

    /**
     * Indicates whether some other object is "equal to" this one.
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return true;
    }

    /**
     * Returns a string representation of the object.
     * <p>
     * 
     * @see java.lang.Object#toString()
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PasswordPolicy [minimumLength=" + minimumLength + "]";
    }

    /**
     * Checks whether the model is valid or not.
     * <p>
     * 
     * @see SdkModel#isValid()
     * @return true if the model is valid; false otherwise.
     */
    @Override
    public boolean isValid() {
        return super.isValid();
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public PasswordPolicy clone() {
        return new PasswordPolicy(this);
    }
}
