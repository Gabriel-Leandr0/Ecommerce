package br.com.ecommerce.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "COSTUMER")
public class Costumer extends PanacheMongoEntity {
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;

    public Costumer() {

    }
    @JsonCreator
     public Costumer(@JsonProperty("name") String name, @JsonProperty("email") String email) {
         this.name = name;
         this.email = email;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

