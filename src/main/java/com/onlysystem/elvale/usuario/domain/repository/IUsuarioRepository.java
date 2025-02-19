package com.onlysystem.elvale.usuario.domain.repository;


import com.onlysystem.elvale.usuario.domain.model.Usuario;

public interface IUsuarioRepository {
    void crearUsuario(Usuario usuario);
    Usuario obtenerUsuario(String id);

}