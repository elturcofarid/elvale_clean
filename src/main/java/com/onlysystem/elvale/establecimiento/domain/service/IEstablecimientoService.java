package com.onlysystem.elvale.establecimiento.domain.service;

import java.util.UUID;

import com.onlysystem.elvale.establecimiento.domain.model.Establecimiento;

public interface IEstablecimientoService {

    void crearEstablecimiento(Establecimiento Establecimiento) ;

    Establecimiento obtenerEstablecimiento(UUID id);

}
