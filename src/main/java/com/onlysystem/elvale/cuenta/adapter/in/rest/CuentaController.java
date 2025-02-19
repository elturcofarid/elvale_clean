package com.onlysystem.elvale.cuenta.adapter.in.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.onlysystem.elvale.cuenta.domain.model.Cuenta;
import com.onlysystem.elvale.cuenta.domain.service.ICuentaService;

@RestController
@RequestMapping("/api/cuentas")
public class CuentaController {

    private final ICuentaService cuentaService;

    public CuentaController(ICuentaService cuentaService) {
        this.cuentaService = cuentaService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Cuenta obtenerCuenta(@PathVariable("id") UUID id) {
        return cuentaService.obtenerCuenta(id);
    }

    @PostMapping()
    public void crearCuenta(@Valid @RequestBody Cuenta cuenta) {
        System.out.println("Creando Cuenta" + cuenta.getUsuarioGestor());
        cuentaService.crearCuenta(cuenta);
    }

    @GetMapping(value = "/establecimiento/{id}", produces = "application/json")
    public ResponseEntity<?> obtenerCuentasEstablecimiento(@PathVariable("id") UUID id) {

        List<Cuenta> cuentas = cuentaService.obtenerCuentaEstablecimiento(id);
        Map<String, Object> response = new HashMap<>();

        if (cuentas == null || cuentas.isEmpty()) {
            response.put("status", HttpStatus.NO_CONTENT);
            response.put("mensaje", "No se encontraron cuentas con ID: " + id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
        }
        response.put("status", HttpStatus.OK.value());
        response.put("mensaje", "Cuentas encontradas exitosamente");
        response.put("data", cuentas);
        return ResponseEntity.ok(response);
    }
}
