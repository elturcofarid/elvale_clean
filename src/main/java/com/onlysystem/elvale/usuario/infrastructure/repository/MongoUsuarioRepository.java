package com.onlysystem.elvale.usuario.infrastructure.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.onlysystem.elvale.usuario.infrastructure.persistence.UsuarioDocument;

@Repository
public interface MongoUsuarioRepository extends MongoRepository<UsuarioDocument, UUID> {

    UsuarioDocument findByUid(String uuid);
}