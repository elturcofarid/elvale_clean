package com.onlysystem.elvale.establecimiento.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.validation.constraints.NotNull;

public class Establecimiento {

    @NotNull( message = "El campo 'id' no puede estar vacío")
    public UUID id;
    public String nit;
    public String razonSocial;
    public String direccion;
    public String telefono;
    public String descripcion;
    public String observaciones;
    public String estado;
    public String usuarioGestor;
    public LocalDateTime fechaGestion;
    public String usuarioAprobador;
    public LocalDateTime fechaAprobacion;


    public Establecimiento() {
    }


    public Establecimiento(@NotNull(message = "El campo 'id' no puede estar vacío") UUID id, String nit,
            String razonSocial, String direccion, String telefono, String descripcion, String observaciones,
            String estado, String usuarioGestor, LocalDateTime fechaGestion, String usuarioAprobador,
            LocalDateTime fechaAprobacion) {
        this.id = id;
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.descripcion = descripcion;
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
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    public String getUsuarioGestor() {
        return usuarioGestor;
    }
    public void setUsuarioGestor(String usuarioGestor) {
        this.usuarioGestor = usuarioGestor;
    }
    public LocalDateTime getFechaGestion() {
        return fechaGestion;
    }
    public void setFechaGestion(LocalDateTime fechaGestion) {
        this.fechaGestion = fechaGestion;
    }
    public String getUsuarioAprobador() {
        return usuarioAprobador;
    }
    public void setUsuarioAprobador(String usuarioAprobador) {
        this.usuarioAprobador = usuarioAprobador;
    }
    public LocalDateTime getFechaAprobacion() {
        return fechaAprobacion;
    }
    public void setFechaAprobacion(LocalDateTime fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }


    
}