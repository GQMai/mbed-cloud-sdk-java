// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [SubtenantDarkThemeImage]
package com.arm.mbed.cloud.sdk.branding.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.util.Date;

/**
 * Model for a subtenant dark theme image.
 */
@Preamble(description = "Model for a subtenant dark theme image.")
public abstract class AbstractSubtenantDarkThemeImage implements SdkModel {
    /**
     * Serialisation Id.
     */
    private static final long serialVersionUID = 1114319379121920L;

    /**
     * Name of the image.
     */
    protected SubtenantDarkThemeImageReference reference;

    /**
     * The static link to the image.
     */
    protected final String staticUri;

    /**
     * Last update time in UTC.
     */
    protected final Date updatedAt;

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on all fields.
     * <p>
     * Note: Should not be used. Use {@link #AbstractSubtenantDarkThemeImage()} instead.
     * 
     * @param reference
     *            Name of the image.
     * @param staticUri
     *            The static link to the image.
     * @param updatedAt
     *            Last update time in UTC.
     */
    @Internal
    public AbstractSubtenantDarkThemeImage(SubtenantDarkThemeImageReference reference, String staticUri,
                                           Date updatedAt) {
        super();
        this.staticUri = staticUri;
        this.updatedAt = updatedAt;
        setReference(reference);
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on a similar object.
     * <p>
     * Note: Should not be used. Use {@link #AbstractSubtenantDarkThemeImage()} instead.
     * 
     * @param abstractSubtenantDarkThemeImage
     *            an abstract subtenant dark theme image.
     */
    @Internal
    public AbstractSubtenantDarkThemeImage(AbstractSubtenantDarkThemeImage abstractSubtenantDarkThemeImage) {
        this(abstractSubtenantDarkThemeImage == null ? SubtenantDarkThemeImageReference.getDefault()
                                                     : abstractSubtenantDarkThemeImage.reference,
             abstractSubtenantDarkThemeImage == null ? (String) null : abstractSubtenantDarkThemeImage.staticUri,
             abstractSubtenantDarkThemeImage == null ? new Date() : abstractSubtenantDarkThemeImage.updatedAt);
    }

    /**
     * Constructor.
     */
    public AbstractSubtenantDarkThemeImage() {
        this(SubtenantDarkThemeImageReference.getDefault(), (String) null, new Date());
    }

    /**
     * Internal constructor.
     * 
     * <p>
     * Constructor based on read-only fields.
     * <p>
     * Note: Should not be used. Use {@link #AbstractSubtenantDarkThemeImage()} instead.
     * 
     * @param staticUri
     *            The static link to the image.
     * @param updatedAt
     *            Last update time in UTC.
     */
    @Internal
    public AbstractSubtenantDarkThemeImage(String staticUri, Date updatedAt) {
        this(SubtenantDarkThemeImageReference.getDefault(), staticUri, updatedAt);
    }

    /**
     * Gets name of the image.
     * 
     * @return reference
     */
    public SubtenantDarkThemeImageReference getReference() {
        return reference;
    }

    /**
     * Sets name of the image.
     * 
     * @param reference
     *            Name of the image.
     */
    public void setReference(SubtenantDarkThemeImageReference reference) {
        this.reference = reference;
    }

    /**
     * Sets name of the image.
     * 
     * <p>
     * Similar to {@link #setReference(com.arm.mbed.cloud.sdk.branding.model.SubtenantDarkThemeImageReference)}
     * 
     * @param reference
     *            Name of the image.
     */
    @Internal
    public void setReference(String reference) {
        this.reference = SubtenantDarkThemeImageReference.getValue(reference);
    }

    /**
     * Gets the static link to the image.
     * 
     * @return staticUri
     */
    public String getStaticUri() {
        return staticUri;
    }

    /**
     * Gets last update time in utc.
     * 
     * @return updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
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
        return "AbstractSubtenantDarkThemeImage [reference=" + reference + ", staticUri=" + staticUri + ", updatedAt="
               + updatedAt + "]";
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
        result = prime * result + ((reference == null) ? 0 : reference.hashCode());
        result = prime * result + ((staticUri == null) ? 0 : staticUri.hashCode());
        result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
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
        return other instanceof AbstractSubtenantDarkThemeImage;
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
        if (!(obj instanceof SubtenantDarkThemeImage)) {
            return false;
        }
        final SubtenantDarkThemeImage other = (SubtenantDarkThemeImage) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        if (reference != other.reference) {
            return false;
        }
        if (staticUri == null) {
            if (other.staticUri != null) {
                return false;
            }
        } else if (!staticUri.equals(other.staticUri)) {
            return false;
        }
        if (updatedAt == null) {
            if (other.updatedAt != null) {
                return false;
            }
        } else if (!updatedAt.equals(other.updatedAt)) {
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
    public abstract Object clone();
}
