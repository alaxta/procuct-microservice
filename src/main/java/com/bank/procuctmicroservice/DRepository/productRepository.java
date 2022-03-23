package com.bank.procuctmicroservice.DRepository;

import com.bank.procuctmicroservice.MEntity.productEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface productRepository extends MongoRepository<productEntity,String>  {
    public Optional<productEntity> findByproductName(String prod);

}
