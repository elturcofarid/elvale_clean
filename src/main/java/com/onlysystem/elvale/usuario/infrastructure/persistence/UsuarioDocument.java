package com.onlysystem.elvale.usuario.infrastructure.persistence;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "usuarios")
public class UsuarioDocument {

    @Id
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
    private UUID establecimiento;
    private String rol;
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

    public UsuarioDocument(){}

    public UsuarioDocument(UUID id, String nombres, String apellidos,String celular, String direccion, String telefono, String email, 
            String estado, LocalDateTime fechaGestion, UUID establecimiento, String rol, String uid)
    {
        this.id =id;
        this.uid = uid;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.celular = celular;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
        this.fechaGestion = fechaGestion;   
        this.establecimiento = establecimiento;
        this.rol = rol;
        }

}
