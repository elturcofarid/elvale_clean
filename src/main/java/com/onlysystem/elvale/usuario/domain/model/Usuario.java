package com.onlysystem.elvale.usuario.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.validation.constraints.NotNull;

public class Usuario {

   
    private UUID id;
    private String tipoIdentificacion;
    private String identificacion;
    private String nombres; 
    private String apellidos;
    private String celular;
    private String direccion;
    private String telefono;
    private String email; 
    private String estado;
    private LocalDateTime fechaGestion;
    @NotNull( message = "El campo 'establecimiento' no puede estar vacío")
    private UUID establecimiento;
    @NotNull( message = "El campo 'rol' no puede estar vacío")
    private String rol;
    @NotNull( message = "El campo 'id Firebase' no puede estar vacío")
    private String uid;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaGestion() {
        return fechaGestion;
    }

    public void setFechaGestion(LocalDateTime fechaGestion) {
        this.fechaGestion = fechaGestion;
    }

    public UUID getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(UUID establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Usuario(){}

    public Usuario(UUID id, String tipoIdentificacion, String identificacion, String nombres, String apellidos,
            String celular, String direccion, String telefono, String email, String estado, LocalDateTime fechaGestion,
            UUID establecimiento, String rol, String uid) {
        this.id = id;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
        this.fechaGestion = fechaGestion;
        this.establecimiento = establecimiento;
        this.rol = rol;
        this.uid = uid;
    }
}