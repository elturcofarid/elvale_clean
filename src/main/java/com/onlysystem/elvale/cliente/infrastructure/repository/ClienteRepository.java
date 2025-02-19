package com.onlysystem.elvale.cliente.infrastructure.repository;

import java.util.UUID;
import org.springframework.stereotype.Repository;
import com.onlysystem.elvale.cliente.domain.model.Cliente;
import com.onlysystem.elvale.cliente.domain.repository.IClienteRepository;
import com.onlysystem.elvale.cliente.infrastructure.mapper.ClienteMapper;
import com.onlysystem.elvale.cliente.infrastructure.persistence.ClienteDocument;

@Repository
public class ClienteRepository implements IClienteRepository {
    
    private final MongoClienteRepository mongoRepository;

    public ClienteRepository(MongoClienteRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public void crearCliente(Cliente cliente) {
        ClienteDocument clienteDocument = ClienteMapper.toDocument(cliente);
        mongoRepository.save(clienteDocument);
    }

    @Override
    public Cliente obtenerCliente(UUID id) {
        ClienteDocument clienteDocument = mongoRepository.findById(id).orElse(null);
        if (clienteDocument == null) {
            return null;
        }
        return ClienteMapper.toDomain(clienteDocument);
    }

    @Override
    public Cliente obtenerClienteTipoDocumento(String td, String dc) {
        ClienteDocument clienteDocument = mongoRepository.findByTipoIdentificacionAndIdentificacion(td, dc);
        if (clienteDocument == null) {
            return null;
        }
        return ClienteMapper.toDomain(clienteDocument);
    }

    
}