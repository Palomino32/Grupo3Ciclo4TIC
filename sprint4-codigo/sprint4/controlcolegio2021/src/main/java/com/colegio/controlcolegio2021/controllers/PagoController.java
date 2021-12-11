package com.colegio.controlcolegio2021.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.colegio.controlcolegio2021.models.PagoModel;
import com.colegio.controlcolegio2021.services.PagoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colegio")
public class PagoController {
    
    @Autowired
    PagoService pagoService;

    @PostMapping("/pagos")
    public ResponseEntity<Map<String, String>> guardar(@RequestBody PagoModel pago){
        this.pagoService.guardarPago(pago);

        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Se agregó correctamente");

        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/pagos")
    public List<PagoModel> mostrarPagos() {
        return this.pagoService.obtenerPagos();
    }

    @PutMapping("/pagos")
    public ResponseEntity<Map<String, String>> actualizar(@RequestBody PagoModel pago){
        this.pagoService.guardarPago(pago);

        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Se actualizó correctamente");

        return ResponseEntity.ok(respuesta);
    }
}
