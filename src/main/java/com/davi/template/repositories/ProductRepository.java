package com.davi.template.repositories;

import com.davi.template.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, String> {
    // Remova o método findByPartnerId, pois não é mais necessário
}
