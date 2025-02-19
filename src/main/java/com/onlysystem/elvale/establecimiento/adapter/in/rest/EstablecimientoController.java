package com.onlysystem.elvale.establecimiento.adapter.in.rest;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlysystem.elvale.establecimiento.domain.model.Establecimiento;
import com.onlysystem.elvale.establecimiento.domain.service.IEstablecimientoService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/establecimientos")
public class EstablecimientoController {

    private final IEstablecimientoService establecimientoService;

    public EstablecimientoController(IEstablecimientoService establecimientoService) {
        this.establecimientoService = establecimientoService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Establecimiento obtenerEstablecimiento(@PathVariable("id") UUID id) {
        return establecimientoService.obtenerEstablecimiento(id);
    }

    @PostMapping()
    public void crearEstablecimiento(@Valid @RequestBody Establecimiento establecimiento) {
        establecimientoService.crearEstablecimiento(establecimiento);
    }

}
