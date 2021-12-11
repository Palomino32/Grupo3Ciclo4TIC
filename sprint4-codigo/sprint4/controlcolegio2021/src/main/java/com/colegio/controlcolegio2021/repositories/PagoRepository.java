package com.colegio.controlcolegio2021.repositories;



import com.colegio.controlcolegio2021.models.PagoModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends MongoRepository<PagoModel,String>{
    
}
