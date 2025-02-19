package com.onlysystem.elvale.fiado.infrastructure.mapper;

import com.onlysystem.elvale.fiado.domain.model.Fiado;
import com.onlysystem.elvale.fiado.infrastructure.persistence.FiadoDocument;

public class FiadoMapper {

    public static FiadoDocument toDocument(Fiado fiado) {
        if (fiado == null) {
            return null;
        }
        return new FiadoDocument(
            fiado.getId(),
            fiado.getCuenta(),
            fiado.getValorFio(),
            fiado.getTipo(),
            fiado.getObservaciones(),
            fiado.getEstado(),
            fiado.getUsuarioGestor(),
            fiado.getFechaGestion(),
            fiado.getUsuarioAprobador(),
            fiado.getFechaAprobacion()
        );
    }

    public static Fiado toDomain(FiadoDocument document) {
        if (document == null) {
            return null;
        }
        return new Fiado(
            document.getId(),
            document.getCuenta(),
            document.getValorFio(),
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