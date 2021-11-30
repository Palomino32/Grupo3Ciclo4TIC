package com.colegio.controlcolegio2021.controllers;

import java.util.HashMap;
import java.util.Map;

import com.colegio.controlcolegio2021.models.AdministradorModel;
import com.colegio.controlcolegio2021.services.AdministradorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colegio")
public class AdministradorController {
    
    @Autowired
    AdministradorService administradorService;

    @PostMapping("/administradores")
    public ResponseEntity<Map<String, String>> guardarAdministradores(@RequestBody AdministradorModel administrador){
    
        Map<String, String> respuesta= new HashMap<>();
        AdministradorModel adm=this.administradorService.buscarPorusername(administrador.getUsername());
        if(adm.getId()==null){
            this.administradorService.guardar(administrador);
            respuesta.put("mensaje", "Se agregó correctamente");
        }else{
            respuesta.put("mensaje", "El administrador ya existe");
        }

        return ResponseEntity.ok(respuesta);
    }
}
