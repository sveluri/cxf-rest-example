package com.poc.cxf.rest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.poc.cxf.rest.ProductService;
import com.poc.cxf.rest.model.Product;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Implementation for {@link com.poc.cxf.rest.ProductService}
 */
@Component
@Path("/products")
public class ProductServiceImpl implements ProductService {

    /**
     * {@inheritDoc}
     */
    @Override
    public Response readProduct(UUID productId) {
        Product product = new Product("Product1", "product1 description");
        return Response.ok(product).build();
    }

    @Override
    public List<Product> readProducts() {
        List<Product> products = new ArrayList<>();

       products.add(new Product("Product1", "product1 description"));
       products.add(new Product("Product2", "product2 description"));
       products.add(new Product("Product3", "product3 description"));
       products.add(new Product("Product4", "product4 description"));

        return products;
    }
}
