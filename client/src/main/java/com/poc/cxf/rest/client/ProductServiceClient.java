package com.poc.cxf.rest.client;

import com.poc.cxf.rest.model.Product;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

/**
 * Client for Rest services for {@link com.poc.cxf.rest.ProductService}
 */
public class ProductServiceClient {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        Product forObject = restTemplate.getForObject("http://localhost:8080/cxf-rest-service/services/service/products/"
                + UUID.randomUUID(), Product.class);

        System.out.println(forObject);


    }

}
