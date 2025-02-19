package com.onlysystem.elvale.usuario.infrastructure.mapper;

import com.onlysystem.elvale.usuario.domain.model.Usuario;
import com.onlysystem.elvale.usuario.infrastructure.persistence.UsuarioDocument;

public class UsuarioMapper {

    public static UsuarioDocument toDocument(Usuario usuario) {
        if (usuario == null) {
            return null;
        }

        UsuarioDocument document = new UsuarioDocument();
        document.setId(usuario.getId());
        document.setTipoIdentificacion(usuario.getTipoIdentificacion());
        document.setIdentificacion(usuario.getIdentificacion());
        document.setNombres(usuario.getNombres());
        document.setApellidos(usuario.getApellidos());
        document.setCelular(usuario.getCelular());
        document.setDireccion(usuario.getDireccion());
        document.setTelefono(usuario.getTelefono());
        document.setEmail(usuario.getEmail());
        document.setEstado(usuario.getEstado());
        document.setFechaGestion(usuario.getFechaGestion());
        document.setEstablecimiento(usuario.getEstablecimiento());
        document.setRol(usuario.getRol());
        document.setUid(usuario.getUid());

        return document;
    }

    public static Usuario toDomain(UsuarioDocument document) {
        if (document == null) {
            return null;
        }

        return new Usuario(
            document.getId(),
            document.getTipoIdentificacion(),
            document.getIdentificacion(),
            document.getNombres(),
            document.getApellidos(),
            document.getCelular(),
            document.getDireccion(),
            document.getTelefono(),
            document.getEmail(),
            document.getEstado(),
            document.getFechaGestion(),
            document.getEstablecimiento(),
            document.getRol(),
            document.getUid()
        );
    }
}