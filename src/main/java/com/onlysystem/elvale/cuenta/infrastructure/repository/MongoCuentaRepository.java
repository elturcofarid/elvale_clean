package com.onlysystem.elvale.cuenta.infrastructure.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.onlysystem.elvale.cuenta.infrastructure.persistence.CuentaDocument;
import java.util.List;


@Repository
public interface MongoCuentaRepository extends MongoRepository<CuentaDocument, UUID> {
    List<CuentaDocument> findByIdEstablecimiento(UUID idEstablecimiento);


}