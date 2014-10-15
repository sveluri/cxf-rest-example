package com.poc.cxf.rest.service.test;

import java.util.UUID;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.Client;
import org.junit.Ignore;
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

    static
    {
        Class clazz = org.springframework.beans.factory.support.BeanDefinitionBuilder.class;

        String className = clazz.getName();
        String resource = "/" + className.replace('.', '/') + ".class";
        System.out.println("Class " + className + " loaded from URL : " + clazz.getResource(resource));
    }

    /**
     * This tests the running server deployed on 8080 port.
     * To change the base URI, change in test-beans.xml}
     */
    @Test
    public void test() {
//        Response response = productService.readProduct(UUID.randomUUID());
//        Product product = response.readEntity(Product.class);
//        System.out.println(product);

    }
}
