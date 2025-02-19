package com.onlysystem.elvale.fiado.domain.repository;

import java.util.UUID;
import com.onlysystem.elvale.fiado.domain.model.Fiado;

public interface IFiadoRepository {
    void crearFiado(Fiado fiado);
    Fiado obtenerFiado(UUID id);
}