package br.com.ecommerce.controller.costumer;

import br.com.ecommerce.repository.CostumerRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
@Path("/costumer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GetCostumer {
    @Inject
    CostumerRepository costumerRepository;
    @GET
    public Response listCostumer(){

        return Response.ok(costumerRepository.listAll()).build();
    }
}
