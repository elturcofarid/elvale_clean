package com.onlysystem.elvale.usuario.infrastructure.repository;


import org.springframework.stereotype.Repository;

import com.onlysystem.elvale.usuario.domain.model.Usuario;
import com.onlysystem.elvale.usuario.domain.repository.IUsuarioRepository;
import com.onlysystem.elvale.usuario.infrastructure.mapper.UsuarioMapper;
import com.onlysystem.elvale.usuario.infrastructure.persistence.UsuarioDocument;

@Repository
public class UsuarioRepository implements IUsuarioRepository {
    
    private final MongoUsuarioRepository mongoRepository;

    public UsuarioRepository(MongoUsuarioRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        UsuarioDocument usuarioDocument = UsuarioMapper.toDocument(usuario);
        mongoRepository.save(usuarioDocument);
    }

    @Override
    public Usuario obtenerUsuario(String id) {
        UsuarioDocument usuarioDocument = mongoRepository.findByUid(id);
        if (usuarioDocument == null) {
            return null;
        }
        return UsuarioMapper.toDomain(usuarioDocument);
    }
}