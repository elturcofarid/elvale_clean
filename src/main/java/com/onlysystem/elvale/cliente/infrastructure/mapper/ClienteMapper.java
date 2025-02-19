package com.onlysystem.elvale.cliente.infrastructure.mapper;

import com.onlysystem.elvale.cliente.domain.model.Cliente;
import com.onlysystem.elvale.cliente.infrastructure.persistence.ClienteDocument;

public class ClienteMapper {

    public static ClienteDocument toDocument(Cliente cliente) {
        if (cliente == null) {
            return null;
        }
        
        return new ClienteDocument(
            cliente.getId(),
            cliente.getTipoIdentificacion(),
            cliente.getIdentificacion(),
            cliente.getNombres(),
            cliente.getApellidos(),
            cliente.getDireccion(),
            cliente.getCelular(),
            cliente.getTelefono(),
            cliente.getEmail(),
            cliente.getEstado()
        );
    }

    public static Cliente toDomain(ClienteDocument document) {
        if (document == null) {
            return null;
        }
        
        return new Cliente(
            document.getId(),
            document.getTipoIdentificacion(),
            document.getIdentificacion(),
            document.getNombres(),
            document.getApellidos(),
            document.getDireccion(),
            document.getCelular(),
            document.getTelefono(),
            document.getEmail(),
            document.getEstado()
        );
    }
}