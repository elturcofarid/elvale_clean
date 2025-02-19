package com.onlysystem.elvale.cliente.adapter.in.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlysystem.elvale.cliente.domain.model.Cliente;
import com.onlysystem.elvale.cliente.domain.service.IClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final IClienteService clienteService;

    public ClienteController(IClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Cliente obtenerCliente(@PathVariable("id") UUID id) {
        return clienteService.obtenerCliente(id);
    }

    @GetMapping(value = "/td/{td}/{dc}", produces = "application/json")
    public ResponseEntity<?> obtenerClienteTd(@PathVariable("td") String td, @PathVariable("dc") String dc) {

        Cliente cliente = clienteService.obtenerClienteTipoDocumento(td,dc);
        Map<String, Object> response = new HashMap<>();

        if (cliente == null || cliente.getIdentificacion().isEmpty()) {
            response.put("status", HttpStatus.NOT_FOUND.value());
            response.put("mensaje", "No se encontraron cuentas con ID: " + dc);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
        response.put("status", HttpStatus.OK.value());
        response.put("mensaje", "Cuentas encontradas exitosamente");
        response.put("data", cliente);
        return ResponseEntity.ok(response);
    }

    @PostMapping()
    public void crearCliente(@Valid @RequestBody Cliente cliente) {
        clienteService.crearCliente(cliente);
    }

}
