package com.onlysystem.elvale.cliente.domain.service;

import java.util.UUID;
import com.onlysystem.elvale.cliente.domain.model.Cliente;

public interface IClienteService {

    void crearCliente(Cliente cliente) ;

    Cliente obtenerCliente(UUID id);

    Cliente obtenerClienteTipoDocumento(String td, String dc);
}
