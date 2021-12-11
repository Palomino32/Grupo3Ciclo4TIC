package com.colegio.controlcolegio2021.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.colegio.controlcolegio2021.models.EstudianteModel;
import com.colegio.controlcolegio2021.services.EstudianteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/colegio")
public class EstudianteController {
    
    @Autowired
    EstudianteService estudianteService;

    @PostMapping("/estudiantes")
    public ResponseEntity <Map<String, String>> guardarEstudiante(@Validated @RequestBody EstudianteModel estudiante) {
        this.estudianteService.guardarEstudiantes(estudiante);
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje","Se añadió correctamente");
        respuesta.put("estado", "true");
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/estudiantes")
    public List<EstudianteModel>obtenerEstudiante() {
        return this.estudianteService.obtenerEstudiants();
    }

    @GetMapping("/estudiantes/{id}")
    public EstudianteModel obtenerEstudiantePorid(@PathVariable String id){
        return this.estudianteService.buscarPorId(id).get();
    }
}
