package com.onlysystem.elvale.cuenta.infrastructure.mapper;

import com.onlysystem.elvale.cuenta.domain.model.Cuenta;
import com.onlysystem.elvale.cuenta.infrastructure.persistence.CuentaDocument;

public class CuentaMapper {

    public static CuentaDocument toDocument(Cuenta cuenta) {
        if (cuenta == null) {
            return null;
        }
        
        return new CuentaDocument(
            cuenta.getId(),
            cuenta.getIdEstablecimiento(),
            cuenta.getIdCliente(),
            cuenta.getMontoAprobado(),
            cuenta.getTipo(),
            cuenta.getObservaciones(),
            cuenta.getEstado(),
            cuenta.getUsuarioGestor(),
            cuenta.getFechaGestion(),
            cuenta.getUsuarioAprobador(),
            cuenta.getFechaAprobacion()
        );
    }

    public static Cuenta toDomain(CuentaDocument document) {
        if (document == null) {
            return null;
        }
        
        return new Cuenta(
            document.getId(),
            document.getIdEstablecimiento(),
            document.getIdCliente(),
            document.getMontoAprobado(),
            document.getTipo(),
            document.getObservaciones(),
            document.getEstado(),
            document.getUsuarioGestor(),
            document.getFechaGestion(),
            document.getUsuarioAprobador(),
            document.getFechaAprobacion()
        );
    }
}