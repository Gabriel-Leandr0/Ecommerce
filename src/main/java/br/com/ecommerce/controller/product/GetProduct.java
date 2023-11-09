package br.com.ecommerce.controller.product;

import br.com.ecommerce.repository.ProductRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/product")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GetProduct {
    @Inject
    ProductRepository productRepository;
    @GET
    public Response listProduct(){

        return Response.ok(productRepository.listAll()).build();
    }
}
