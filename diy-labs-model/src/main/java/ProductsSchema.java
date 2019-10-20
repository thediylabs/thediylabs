import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


/**
 * The Root Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(productId).append(productName).append(tags).append(price).toHashCode();
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
        return new EqualsBuilder().append(productId, rhs.productId).append(productName, rhs.productName).append(tags, rhs.tags).append(price, rhs.price).isEquals();
    }

}
