package com.colegio.controlcolegio2021.services;

import java.util.List;
import java.util.Optional;

import com.colegio.controlcolegio2021.models.AdministradorModel;
import com.colegio.controlcolegio2021.repositories.AdministradorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService {
    
    @Autowired
    AdministradorRepository administradorRepository;

    public void guardar(AdministradorModel administrador){
        this.administradorRepository.save(administrador);
    }

    public List<AdministradorModel> traerAdministradores(){
        return this.administradorRepository.findAll();
    }

    public Optional<AdministradorModel> buscarPorId(String id){
        return this.administradorRepository.findById(id);
    }

    public AdministradorModel buscarPorusername(String username){
        return this.administradorRepository.findByUsername(username).orElse(new AdministradorModel());
    }
}
