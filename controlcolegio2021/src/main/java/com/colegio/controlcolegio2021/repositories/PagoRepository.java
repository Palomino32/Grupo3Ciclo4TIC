package com.colegio.controlcolegio2021.repositories;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends MongoRepository<PagoRepository,String>{
    
}
