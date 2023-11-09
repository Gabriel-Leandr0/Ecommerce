package br.com.ecommerce.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "PRODUCT")
public class Product extends PanacheMongoEntity {
    @JsonProperty("nameProd")
    private String nameProd;
    @JsonProperty("price")
    private Double price;

    public Product() {
    }

    public Product(String nameProd, Double price) {
        this.nameProd = nameProd;
        this.price = price;
    }

    public String getNameProd() {
        return nameProd;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}