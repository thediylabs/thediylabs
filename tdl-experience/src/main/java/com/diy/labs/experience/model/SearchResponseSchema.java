package com.diy.labs.experience.model;

import java.util.List;

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
    "products",
})

@Builder
@Data
@Getter @Setter
public class SearchResponseSchema {
	
    @JsonProperty("products")
    public List<Product> products = null;
    /**
     * The Product List Schema
     * <p>
     * 
     * (Required)
     * 
     */
	
}
