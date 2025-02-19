package com.onlysystem.elvale.cuenta.domain.service;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import com.onlysystem.elvale.cuenta.domain.model.Cuenta;
import com.onlysystem.elvale.cuenta.domain.repository.ICuentaRepository;

@Service
public class CuentaService implements ICuentaService {

    private final ICuentaRepository cuentaRepository;
    // private final ApplicationEventPublisher eventPublisher;

    public CuentaService(ICuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }

    @Override
    public void crearCuenta(Cuenta Cuenta) {
        // Cuenta nuevoCuenta = CuentaRepository.guardar(Cuenta);
        // eventPublisher.publishEvent(new CuentaEvent(this, "Cuenta creado: " +
        // Cuenta.getNombre()));
        cuentaRepository.crearCuenta(Cuenta);
    }

    @Override
    public Cuenta obtenerCuenta(UUID id) {
        return cuentaRepository.obtenerCuenta(id);
    }

    @Override
    public List<Cuenta> obtenerCuentaEstablecimiento(UUID id){
        return cuentaRepository.obtenerCuentaEstablecimiento(id);
    }
}
