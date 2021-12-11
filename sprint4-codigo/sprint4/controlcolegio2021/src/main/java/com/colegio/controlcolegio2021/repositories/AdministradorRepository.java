package com.colegio.controlcolegio2021.repositories;

import java.util.Optional;

import com.colegio.controlcolegio2021.models.AdministradorModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends MongoRepository<AdministradorModel, String>{
    public Optional<AdministradorModel> findByUsername(String username);
}
