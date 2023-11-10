package br.com.ecommerce.service.impl;

import br.com.ecommerce.model.Employee;
import br.com.ecommerce.events.producer.EmployeeProducer;
import br.com.ecommerce.service.EmployeeService;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeProducer employeeProducer;

    public EmployeeServiceImpl(EmployeeProducer employeeProducer) {
        this.employeeProducer = employeeProducer;
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeProducer.createEmployee(employee);
    }
}
