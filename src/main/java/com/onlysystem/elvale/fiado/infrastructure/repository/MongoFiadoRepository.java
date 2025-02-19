package com.onlysystem.elvale.fiado.infrastructure.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.onlysystem.elvale.fiado.infrastructure.persistence.FiadoDocument;

@Repository
public interface MongoFiadoRepository extends MongoRepository<FiadoDocument, UUID> {
}