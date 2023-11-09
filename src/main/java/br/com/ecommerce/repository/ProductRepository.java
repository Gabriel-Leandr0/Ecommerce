package br.com.ecommerce.repository;
import br.com.ecommerce.model.Product;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class ProductRepository implements PanacheMongoRepository<Product>{
    public Product findByEmail(String nameProd) {
        return find("nameProd", nameProd).firstResult();
    }
}