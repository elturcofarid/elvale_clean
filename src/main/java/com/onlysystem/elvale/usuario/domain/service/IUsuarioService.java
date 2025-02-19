package com.onlysystem.elvale.usuario.domain.service;


import com.onlysystem.elvale.usuario.domain.model.Usuario;

public interface IUsuarioService {

    void crearUsuario(Usuario usuario) ;

    Usuario obtenerUsuario(String id);

}
