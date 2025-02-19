package com.onlysystem.elvale.establecimiento.domain.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.onlysystem.elvale.establecimiento.domain.model.Establecimiento;
import com.onlysystem.elvale.establecimiento.domain.repository.IEstablecimientoRepository;

@Service
public class EstablecimientoService implements IEstablecimientoService {

    private final IEstablecimientoRepository establecimientoRepository;
    // private final ApplicationEventPublisher eventPublisher;

    public EstablecimientoService(IEstablecimientoRepository establecimientoRepository) {
        this.establecimientoRepository = establecimientoRepository;
    }

    @Override
    public void crearEstablecimiento(Establecimiento establecimiento) {
        // establecimiento nuevoestablecimiento = establecimientoRepository.guardar(establecimiento);
        // eventPublisher.publishEvent(new establecimientoEvent(this, "establecimiento creado: " +
        // establecimiento.getNombre()));
        establecimientoRepository.crearEstablecimiento(establecimiento);
    }

    @Override
    public Establecimiento obtenerEstablecimiento(UUID id) {
        return establecimientoRepository.obtenerEstablecimiento(id);
    }
}
