
package com.diy.labs.experience.model;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/**
 * The Root Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productId",
    "productName",
    "tags",
    "price"
})
@Data
@Getter @Setter
public class Product {

    /**
     * The Productid Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("productId")
    public Integer productId = 0;
    /**
     * The Productname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("productName")
    public String productName = "";
    /**
     * The Tags Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public List<String> tags = null;
    /**
     * The Price Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    public Double price = 0.0D;

}
