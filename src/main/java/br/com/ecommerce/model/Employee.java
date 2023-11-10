package br.com.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
public class Employee {

    @NotBlank(message = "First name cannot be null")
    private String firstName;
    private String lastName;
    @NotBlank(message = "Employee code cannot be null")
    private String empCode;

}
