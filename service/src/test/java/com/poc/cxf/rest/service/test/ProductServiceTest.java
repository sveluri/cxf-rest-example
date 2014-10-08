package com.poc.cxf.rest.service.test;

import java.util.UUID;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poc.cxf.rest.ProductService;
import com.poc.cxf.rest.model.Product;

/**
 * Integration test case for {@link com.poc.cxf.rest.ProductService}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-beans.xml")
public class ProductServiceTest {

    @Autowired
    private Client restClient;

    @Autowired
    private ProductService productService;

    @Test
    public void test() {
        Response response = productService.readProduct(UUID.randomUUID());
        Product product = response.readEntity(Product.class);
        System.out.println(product);
    }
}
