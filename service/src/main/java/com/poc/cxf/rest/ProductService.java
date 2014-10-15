package com.poc.cxf.rest;

import com.poc.cxf.rest.model.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.UUID;

/**
 * ProductService implementation for REST services
 */
public interface ProductService {

    @GET
    @Path("/{productid}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    Response readProduct(@PathParam("productid") UUID productId);

    @GET
    @Path("/")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    List<Product> readProducts();

}
