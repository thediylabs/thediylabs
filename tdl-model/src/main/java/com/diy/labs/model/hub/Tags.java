
package com.diy.labs.model.hub;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


/**
 * The Tags Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sweet",
    "cake",
    "delicacy"
})
public class Tags {

    /**
     * The Sweet Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sweet")
    @NotNull
    public Integer sweet = 0;
    /**
     * The Cake Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("cake")
    @NotNull
    public Integer cake = 0;
    /**
     * The Delicacy Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("delicacy")
    @NotNull
    public Integer delicacy = 0;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tags() {
    }

    /**
     * 
     * @param cake
     * @param sweet
     * @param delicacy
     */
    public Tags(Integer sweet, Integer cake, Integer delicacy) {
        super();
        this.sweet = sweet;
        this.cake = cake;
        this.delicacy = delicacy;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sweet).append(cake).append(delicacy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tags) == false) {
            return false;
        }
        Tags rhs = ((Tags) other);
        return new EqualsBuilder().append(sweet, rhs.sweet).append(cake, rhs.cake).append(delicacy, rhs.delicacy).isEquals();
    }

}
