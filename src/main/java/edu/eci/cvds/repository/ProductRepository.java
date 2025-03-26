package edu.eci.cvds.repository;


import edu.eci.cvds.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}