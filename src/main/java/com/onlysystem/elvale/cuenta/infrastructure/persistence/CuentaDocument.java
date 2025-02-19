package com.onlysystem.elvale.cuenta.infrastructure.persistence;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.util.UUID;

@Document(collection = "cuentas")
public class CuentaDocument {

    @Id
    private UUID id;
    private UUID idEstablecimiento;
    private UUID idCliente;
    private double montoAprobado;
    private String tipo;
    private String observaciones;
    private String estado;
    private String usuarioGestor;
    private String fechaGestion;
    private String usuarioAprobador;
    private String fechaAprobacion;

    public CuentaDocument(UUID id, UUID idEstablecimiento, UUID idCliente, double montoAprobado, String tipo, String observaciones,
            String estado, String usuarioGestor, String fechaGestion, String usuarioAprobador, String fechaAprobacion) {
        this.id = id;
        this.idEstablecimiento = idEstablecimiento;
        this.idCliente = idCliente;
        this.montoAprobado = montoAprobado;
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

    public UUID getIdEstablecimiento() {
        return idEstablecimiento;
    }

    public void setIdEstablecimiento(UUID idEstablecimiento) {
        this.idEstablecimiento = idEstablecimiento;
    }

    public UUID getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(UUID idCliente) {
        this.idCliente = idCliente;
    }

    public double getMontoAprobado() {
        return montoAprobado;
    }

    public void setMontoAprobado(double montoAprobado) {
        this.montoAprobado = montoAprobado;
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

    public String getUsuarioGestor() {
        return usuarioGestor;
    }

    public void setUsuarioGestor(String usuarioGestor) {
        this.usuarioGestor = usuarioGestor;
    }

    public String getFechaGestion() {
        return fechaGestion;
    }

    public void setFechaGestion(String fechaGestion) {
        this.fechaGestion = fechaGestion;
    }

    public String getUsuarioAprobador() {
        return usuarioAprobador;
    }

    public void setUsuarioAprobador(String usuarioAprobador) {
        this.usuarioAprobador = usuarioAprobador;
    }

    public String getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(String fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

}
