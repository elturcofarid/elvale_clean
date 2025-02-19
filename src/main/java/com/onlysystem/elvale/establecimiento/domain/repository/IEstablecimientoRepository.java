package com.onlysystem.elvale.establecimiento.domain.repository;

import java.util.UUID;
import com.onlysystem.elvale.establecimiento.domain.model.Establecimiento;

public interface IEstablecimientoRepository {
    void crearEstablecimiento(Establecimiento establecimeinto);
    Establecimiento obtenerEstablecimiento(UUID id);
}