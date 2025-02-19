package com.onlysystem.elvale.establecimiento.infrastructure.repository;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.onlysystem.elvale.establecimiento.domain.model.Establecimiento;
import com.onlysystem.elvale.establecimiento.domain.repository.IEstablecimientoRepository;
import com.onlysystem.elvale.establecimiento.infrastructure.mapper.EstablecimientoMapper;
import com.onlysystem.elvale.establecimiento.infrastructure.persistence.EstablecimientoDocument;

@Repository
public class EstablecimientoRepository implements IEstablecimientoRepository {
    
    private final MongoEstablecimientoRepository mongoRepository;

    public EstablecimientoRepository(MongoEstablecimientoRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public void crearEstablecimiento(Establecimiento establecimiento) {
        EstablecimientoDocument establecimientoDocument = EstablecimientoMapper.toDocument(establecimiento);
        mongoRepository.save(establecimientoDocument);
    }

    @Override
    public Establecimiento obtenerEstablecimiento(UUID id) {
        EstablecimientoDocument establecimientoDocument = mongoRepository.findById(id).orElse(null);
        if (establecimientoDocument == null) {
            return null;
        }
        return EstablecimientoMapper.toDomain(establecimientoDocument);
    }
}