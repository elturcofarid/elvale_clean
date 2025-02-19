package com.onlysystem.elvale.establecimiento.infrastructure.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.onlysystem.elvale.establecimiento.infrastructure.persistence.EstablecimientoDocument;

@Repository
public interface MongoEstablecimientoRepository extends MongoRepository<EstablecimientoDocument, UUID> {
}