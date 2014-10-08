package com.poc.cxf.rest.service.impl;

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
}
