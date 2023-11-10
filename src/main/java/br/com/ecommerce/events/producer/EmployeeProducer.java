package br.com.ecommerce.events.producer;

import br.com.ecommerce.model.Employee;
import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmployeeProducer {

    @Inject
    @Channel("employee-out")
    Emitter<Record<String, Employee>> empEmitter;

    public void createEmployee(Employee employee) {
        empEmitter.send(Record.of(employee.getEmpCode(), employee));
    }
}
