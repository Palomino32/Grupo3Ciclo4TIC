package com.colegio.controlcolegio2021.services;

import java.util.List;

import com.colegio.controlcolegio2021.models.PagoModel;
import com.colegio.controlcolegio2021.repositories.PagoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoService {
    
    @Autowired
    PagoRepository pagoRepository; 

    public void guardarPago(PagoModel pago){
        this.pagoRepository.save(pago);
    }

    public List<PagoModel> obtenerPagos(){
        return this.pagoRepository.findAll();
    }
    
}
