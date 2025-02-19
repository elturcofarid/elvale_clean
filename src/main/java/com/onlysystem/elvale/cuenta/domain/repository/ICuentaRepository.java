package com.onlysystem.elvale.cuenta.domain.repository;

import java.util.List;
import java.util.UUID;
import com.onlysystem.elvale.cuenta.domain.model.Cuenta;

public interface ICuentaRepository {
    void crearCuenta(Cuenta Cuenta);
    Cuenta obtenerCuenta(UUID id);
    List<Cuenta> obtenerCuentaEstablecimiento(UUID id);
}