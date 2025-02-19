package com.onlysystem.elvale.fiado.domain.service;

import java.util.UUID;
import com.onlysystem.elvale.fiado.domain.model.Fiado;

public interface IFiadoService {

    void crearFiado(Fiado fiado) ;

    Fiado obtenerFiado(UUID id);

}
