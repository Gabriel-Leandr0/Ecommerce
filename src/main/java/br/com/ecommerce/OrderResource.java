package br.com.ecommerce;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.UUID;

@Path("/orders")
public class OrderResource {
/*
    @Inject
    br.com.ecommerce.KafkaDispatcher dispatcher;

    @POST
    public Response createOrder() {
        var key = UUID.randomUUID().toString();
        var value = key + ",67523,1234";

        dispatcher.send("ECOMMERCE_NEW_ORDER", key, value);

        var email = "Thank you for your order! We are processing your order!";
            dispatcher.send("ECOMMERCE_SEND_EMAIL", key, email);

        return Response.status(201).entity("Order created successfully").build();
    }
*/
}
