package com.onlysystem.elvale.cliente.domain.model;

import jakarta.validation.constraints.NotNull;
import java.util.UUID;

public class Cliente {

    @NotNull( message = "El campo 'id' no puede estar vacío")
    private UUID id;
    private String tipoIdentificacion;
    private String identificacion;
    private String nombres; 
    private String apellidos;
    private String direccion;
    private String celular;
    private String telefono;
    private String email; 
    private String estado;
 
    public Cliente(UUID id, String tipoIdentificacion, String identificacion, String nombres, String apellidos,
            String direccion, String celular, String telefono, String email, String estado) {
        this.id = id;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.celular = celular;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
    }


    public UUID getIdCliente() {
        return id;
    }

    public void setIdCliente(UUID idCliente) {
        this.id = idCliente;
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
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
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
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    

}