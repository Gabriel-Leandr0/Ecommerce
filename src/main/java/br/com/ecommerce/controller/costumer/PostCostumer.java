package br.com.ecommerce.controller.costumer;

import br.com.ecommerce.model.Costumer;
import br.com.ecommerce.repository.CostumerRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

@Path("/costumer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PostCostumer {
    @Inject
    CostumerRepository costumerRepository;
    @POST
    /*
    @APIResponse(
            responseCode = "201",
            description = "Atendente criado com sucesso.",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = Costumer.class)
            )
    )
     */
    public Response newCostumer(Costumer costumer) throws URISyntaxException {
        if (costumer.getName() == null || costumer.getEmail() == null || costumer.getName().isEmpty() || costumer.getEmail().isEmpty()) {
            // Se o nome ou email estiverem ausentes ou vazios, retornar um erro de validação
            return Response.status(Response.Status.BAD_REQUEST).entity("Name and email are required fields").build();
        }

        // Verificar se o email já existe no banco de dados (você pode implementar essa lógica no seu repositório)
        Costumer existingCostumer = costumerRepository.findByEmail(costumer.getEmail());
        if (existingCostumer != null) {
            return Response.status(Response.Status.BAD_REQUEST).entity("Email already exists").build();
        }

        costumerRepository.persist(costumer);
        return Response.created(new URI("/" + costumer.getId())).entity("Costumer created!").build();
    }
}
