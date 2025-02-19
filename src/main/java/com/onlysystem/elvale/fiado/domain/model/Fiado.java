package com.onlysystem.elvale.fiado.domain.model;

import jakarta.validation.constraints.NotNull;
import java.util.UUID;

public class Fiado {

    
    private UUID id;
    @NotNull( message = "El campo 'id' no puede estar vacío")
    private UUID cuenta;
    private double valorFio; 
    private String tipo; 
    private String observaciones; 
    private String estado;
    private UUID usuarioGestor;
    private String fechaGestion;
    private UUID usuarioAprobador;
    private String fechaAprobacion;


    
    public Fiado(UUID id, UUID cuenta, double valorFio,
            String tipo, String observaciones, String estado, UUID usuarioGestor, String fechaGestion,
            UUID usuarioAprobador, String fechaAprobacion) {
        this.id = UUID.randomUUID();
        this.cuenta = cuenta;
        this.valorFio = valorFio;
        this.tipo = tipo;
        this.observaciones = observaciones;
        this.estado = estado;
        this.usuarioGestor = usuarioGestor;
        this.fechaGestion = fechaGestion;
        this.usuarioAprobador = usuarioAprobador;
        this.fechaAprobacion = fechaAprobacion;
    }


    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public UUID getCuenta() {
        return cuenta;
    }
    public void setCuenta(UUID cuenta) {
        this.cuenta = cuenta;
    }
    public double getValorFio() {
        return valorFio;
    }
    public void setValorFio(double valorFio) {
        this.valorFio = valorFio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public UUID getUsuarioGestor() {
        return usuarioGestor;
    }
    public void setUsuarioGestor(UUID usuarioGestor) {
        this.usuarioGestor = usuarioGestor;
    }
    public String getFechaGestion() {
        return fechaGestion;
    }
    public void setFechaGestion(String fechaGestion) {
        this.fechaGestion = fechaGestion;
    }
    public UUID getUsuarioAprobador() {
        return usuarioAprobador;
    }
    public void setUsuarioAprobador(UUID usuarioAprobador) {
        this.usuarioAprobador = usuarioAprobador;
    }
    public String getFechaAprobacion() {
        return fechaAprobacion;
    }
    public void setFechaAprobacion(String fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    

}