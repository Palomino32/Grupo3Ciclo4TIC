package com.colegio.controlcolegio2021.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pagos")
public class PagoModel {
    
    @Id
    private String id;
    private AdministradorModel administrador;
    private EstudianteModel pagoMatricula;
    private EstudianteModel pagoCurso;
    private EstudianteModel pagoRecreacion;
    private String fecha;
    private float montoMatricula;
    private float montoCurso;
    private float montoRecreacion;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public AdministradorModel getAdministrador() {
        return administrador;
    }
    public void setAdministrador(AdministradorModel administrador) {
        this.administrador = administrador;
    }
    public EstudianteModel getPagoMatricula() {
        return pagoMatricula;
    }
    public void setPagoMatricula(EstudianteModel pagoMatricula) {
        this.pagoMatricula = pagoMatricula;
    }
    public EstudianteModel getPagoCurso() {
        return pagoCurso;
    }
    public void setPagoCurso(EstudianteModel pagoCurso) {
        this.pagoCurso = pagoCurso;
    }
    public EstudianteModel getPagoRecreacion() {
        return pagoRecreacion;
    }
    public void setPagoRecreacion(EstudianteModel pagoRecreacion) {
        this.pagoRecreacion = pagoRecreacion;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public float getMontoMatricula() {
        return montoMatricula;
    }
    public void setMontoMatricula(float montoMatricula) {
        this.montoMatricula = montoMatricula;
    }
    public float getMontoCurso() {
        return montoCurso;
    }
    public void setMontoCurso(float montoCurso) {
        this.montoCurso = montoCurso;
    }
    public float getMontoRecreacion() {
        return montoRecreacion;
    }
    public void setMontoRecreacion(float montoRecreacion) {
        this.montoRecreacion = montoRecreacion;
    }

    
}
