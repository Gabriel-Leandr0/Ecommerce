package br.com.ecommerce.resource;

import br.com.ecommerce.model.Employee;
import br.com.ecommerce.service.EmployeeService;
import jakarta.inject.Inject;

import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    @Inject
    EmployeeService employeeService;

    @POST
    public Response createEmployee(@Valid Employee employee) {
        employeeService.createEmployee(employee);
        return Response.accepted().build();
    }
}
