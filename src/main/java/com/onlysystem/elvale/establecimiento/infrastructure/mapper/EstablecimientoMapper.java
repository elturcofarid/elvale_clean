package com.onlysystem.elvale.establecimiento.infrastructure.mapper;

import com.onlysystem.elvale.establecimiento.domain.model.Establecimiento;
import com.onlysystem.elvale.establecimiento.infrastructure.persistence.EstablecimientoDocument;

public class EstablecimientoMapper {

    public static EstablecimientoDocument toDocument(Establecimiento establecimiento) {
        if (establecimiento == null) {
            return null;
        }

        return new EstablecimientoDocument(
            establecimiento.getId(),
            establecimiento.getNit(),
            establecimiento.getRazonSocial(),
            establecimiento.getDireccion(),
            establecimiento.getTelefono(),
            establecimiento.getDescripcion(),
            establecimiento.getObservaciones(),
            establecimiento.getEstado(),
            establecimiento.getUsuarioGestor(),
            establecimiento.getFechaGestion(),
            establecimiento.getUsuarioAprobador(),
            establecimiento.getFechaAprobacion()
        );
    }

    public static Establecimiento toDomain(EstablecimientoDocument document) {
        if (document == null) {
            return null;
        }

        return new Establecimiento(
            document.getId(),
            document.getNit(),
            document.getRazonSocial(),
            document.getDireccion(),
            document.getTelefono(),
            document.getDescripcion(),
            document.getObservaciones(),
            document.getEstado(),
            document.getUsuarioGestor(),
            document.getFechaGestion(),
            document.getUsuarioAprobador(),
            document.getFechaAprobacion()
        );
    }
}