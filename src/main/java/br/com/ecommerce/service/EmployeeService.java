package br.com.ecommerce.service;

import br.com.ecommerce.model.Employee;

public interface EmployeeService {

    /**
     * This method publishes message to
     * the topic
     * @param employee
     */
    void createEmployee(Employee employee);
}
