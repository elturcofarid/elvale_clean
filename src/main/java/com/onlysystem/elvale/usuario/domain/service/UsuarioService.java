package com.onlysystem.elvale.usuario.domain.service;


import org.springframework.stereotype.Service;

import com.onlysystem.elvale.usuario.domain.model.Usuario;
import com.onlysystem.elvale.usuario.domain.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

    private final IUsuarioRepository usuarioRepository;
    // private final ApplicationEventPublisher eventPublisher;

    public UsuarioService(IUsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        // Usuario nuevoUsuario = usuarioRepository.guardar(usuario);
        // eventPublisher.publishEvent(new UsuarioEvent(this, "Usuario creado: " +
        // usuario.getNombre()));
        usuarioRepository.crearUsuario(usuario);
    }

    @Override
    public Usuario obtenerUsuario(String id) {
        return usuarioRepository.obtenerUsuario(id);
    }
}
