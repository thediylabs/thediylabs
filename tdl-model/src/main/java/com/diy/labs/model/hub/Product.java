
package com.diy.labs.model.hub;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.data.annotation.Id;


/**
 * The Root Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productCode",
    "productName",
    "productDescription",
    "sellerName",
    "productPrice",
    "qty",
    "tags",
    "status",
    "img"
})
public class Product {

	@Id
	public String id;
	
    /**
     * The Productcode Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("productCode")
    @NotNull
    public Integer productCode = 0;
    /**
     * The Productname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("productName")
    @Pattern(regexp = "^(.*)$")
    @NotNull
    public String productName = "";
    /**
     * The Productdescription Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("productDescription")
    @Pattern(regexp = "^(.*)$")
    @NotNull
    public String productDescription = "";
    /**
     * The Sellername Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sellerName")
    @Pattern(regexp = "^(.*)$")
    @NotNull
    public String sellerName = "";
    /**
     * The Productprice Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("productPrice")
    @NotNull
    public Integer productPrice = 0;
    /**
     * The Qty Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("qty")
    @NotNull
    public Integer qty = 0;
    /**
     * The Tags Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    @Valid
    @NotNull
    public List<String> tags = null;
    /**
     * The Status Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    @Pattern(regexp = "^(.*)$")
    @NotNull
    public String status = "";
    /**
     * The Img Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("img")
    @Pattern(regexp = "^(.*)$")
    @NotNull
    public String img = "";

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param img
     * @param productCode
     * @param qty
     * @param sellerName
     * @param productName
     * @param productDescription
     * @param productPrice
     * @param tags
     * @param status
     */
    public Product(Integer productCode, String productName, String productDescription, String sellerName, Integer productPrice, Integer qty, List<String> tags, String status, String img) {
        super();
        this.productCode = productCode;
        this.productName = productName;
        this.productDescription = productDescription;
        this.sellerName = sellerName;
        this.productPrice = productPrice;
        this.qty = qty;
        this.tags = tags;
        this.status = status;
        this.img = img;
    }
    
    @Override 
    public String toString() {
    	return String.format(
    			"Product[id=%s, productCode='%s', productName='%s', productDescription='%s', sellerName='%s', productPrice='%s', qty='%s', tag='%s', status='%s', img='%s']",
    			id, productCode, productName, productDescription, sellerName, productPrice, qty, tags, status, img);
    }

}
