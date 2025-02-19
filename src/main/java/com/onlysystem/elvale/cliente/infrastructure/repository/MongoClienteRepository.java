package com.onlysystem.elvale.cliente.infrastructure.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.onlysystem.elvale.cliente.infrastructure.persistence.ClienteDocument;

@Repository
public interface MongoClienteRepository extends MongoRepository<ClienteDocument, UUID> {
    ClienteDocument findByTipoIdentificacionAndIdentificacion(String tipoIdentificacion, String identificacion);
}