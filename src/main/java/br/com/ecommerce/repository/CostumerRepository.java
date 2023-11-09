package br.com.ecommerce.repository;
import br.com.ecommerce.model.Costumer;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class CostumerRepository implements PanacheMongoRepository<Costumer>{
    public Costumer findByEmail(String email) {
        return find("email", email).firstResult();
    }
}