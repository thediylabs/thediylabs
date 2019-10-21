
package/Users/nicholaschin/Desktop/thediylabs/model.products;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


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
public class ProductsSchema {

    /**
     * The Productid Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("productId")
    @NotNull
    private Integer productId = 0;
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
    private String productName = "";
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
    private List<String> tags = null;
    /**
     * The Price Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    @NotNull
    private Double price = 0.0D;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductsSchema() {
    }

    /**
     * 
     * @param productId
     * @param price
     * @param productName
     * @param tags
     */
    public ProductsSchema(Integer productId, String productName, List<String> tags, Double price) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.tags = tags;
        this.price = price;
    }

    /**
     * The Productid Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("productId")
    public Integer getProductId() {
        return productId;
    }

    /**
     * The Productid Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("productId")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * The Productname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }

    /**
     * The Productname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * The Tags Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * The Tags Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * The Price Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    /**
     * The Price Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.productId == null)? 0 :this.productId.hashCode()));
        result = ((result* 31)+((this.productName == null)? 0 :this.productName.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductsSchema) == false) {
            return false;
        }
        ProductsSchema rhs = ((ProductsSchema) other);
        return (((((this.productId == rhs.productId)||((this.productId!= null)&&this.productId.equals(rhs.productId)))&&((this.productName == rhs.productName)||((this.productName!= null)&&this.productName.equals(rhs.productName))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
