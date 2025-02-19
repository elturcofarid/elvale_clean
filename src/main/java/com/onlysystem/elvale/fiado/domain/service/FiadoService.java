package com.onlysystem.elvale.fiado.domain.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.onlysystem.elvale.fiado.domain.model.Fiado;
import com.onlysystem.elvale.fiado.domain.repository.IFiadoRepository;

@Service
public class FiadoService implements IFiadoService {

    private final IFiadoRepository fiadoRepository;
    // private final ApplicationEventPublisher eventPublisher;

    public FiadoService(IFiadoRepository fiadoRepository) {
        this.fiadoRepository = fiadoRepository;
    }

    @Override
    public void crearFiado(Fiado fiado) {
        // Fiado nuevoFiado = FiadoRepository.guardar(Fiado);
        // eventPublisher.publishEvent(new FiadoEvent(this, "Fiado creado: " +
        // Fiado.getNombre()));
        fiadoRepository.crearFiado(fiado);
    }

    @Override
    public Fiado obtenerFiado(UUID id) {
        return fiadoRepository.obtenerFiado(id);
    }
}
