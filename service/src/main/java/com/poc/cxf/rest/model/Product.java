package com.poc.cxf.rest.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;

/**
 * Model for Products
 */
@XmlRootElement
public class Product {

    private UUID productId;
    private String name;
    private String description;

    public Product() {}

    public Product(String name, String description) {
        this.productId = UUID.randomUUID();
        this.name = name;
        this.description = description;
    }

    /**
     * Sets new name.
     *
     * @param name New value of name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets productId.
     *
     * @return Value of productId.
     */
    public UUID getProductId() {
        return productId;
    }

    /**
     * Sets new description.
     *
     * @param description New value of description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets new productId.
     *
     * @param productId New value of productId.
     */
    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    /**
     * Gets description.
     *
     * @return Value of description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("productId=").append(productId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
