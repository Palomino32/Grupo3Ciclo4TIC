package com.colegio.controlcolegio2021.services;

import java.util.List;
import java.util.Optional;

import com.colegio.controlcolegio2021.models.EstudianteModel;
import com.colegio.controlcolegio2021.repositories.EstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    
    @Autowired
    EstudianteRepository estudianteRepository;

    public void guardarEstudiantes(EstudianteModel estudiante){
        this.estudianteRepository.save(estudiante);
    }

    public List<EstudianteModel> obtenerEstudiants(){
        return this.estudianteRepository.findAll();
    }

    public Optional<EstudianteModel> buscarPorId(String id){
        return this.estudianteRepository.findById(id);
    }

    public Boolean verificar(String id){
        return this.estudianteRepository.existsById(id);
    } 

    public void eliminar(String id){
        this.estudianteRepository.deleteById(id);
    }

}
