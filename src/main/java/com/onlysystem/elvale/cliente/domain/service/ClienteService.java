package com.onlysystem.elvale.cliente.domain.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.onlysystem.elvale.cliente.domain.model.Cliente;
import com.onlysystem.elvale.cliente.domain.repository.IClienteRepository;

@Service
public class ClienteService implements IClienteService {

    private final IClienteRepository clienteRepository;
    // private final ApplicationEventPublisher eventPublisher;

    public ClienteService(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void crearCliente(Cliente Cliente) {
        // Cliente nuevoCliente = ClienteRepository.guardar(Cliente);
        // eventPublisher.publishEvent(new ClienteEvent(this, "Cliente creado: " +
        // Cliente.getNombre()));
        clienteRepository.crearCliente(Cliente);
    }

    @Override
    public Cliente obtenerCliente(UUID id) {
        return clienteRepository.obtenerCliente(id);
    }

    @Override
    public Cliente obtenerClienteTipoDocumento(String td, String dc) {
        return clienteRepository.obtenerClienteTipoDocumento(td, dc);
    }

}
