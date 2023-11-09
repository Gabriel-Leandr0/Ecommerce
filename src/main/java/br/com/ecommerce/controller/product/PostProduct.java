package br.com.ecommerce.controller.product;

import br.com.ecommerce.model.Product;
import br.com.ecommerce.repository.ProductRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;


import java.net.URI;
import java.net.URISyntaxException;
@Path("/product")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class PostProduct{
    @Inject
    ProductRepository productRepository;
    @POST
    public Response newProduct(Product product) throws URISyntaxException {
        productRepository.persist(product);
        return Response.created(new URI("/" + product.id)).entity("Product created!").build();
    }
}