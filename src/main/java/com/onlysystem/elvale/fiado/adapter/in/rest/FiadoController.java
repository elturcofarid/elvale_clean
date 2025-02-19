package com.onlysystem.elvale.fiado.adapter.in.rest;

import java.util.UUID;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import com.onlysystem.elvale.fiado.domain.model.Fiado;
import com.onlysystem.elvale.fiado.domain.service.IFiadoService;

@RestController
@RequestMapping("/api/fiados")
public class FiadoController {

    private final IFiadoService fiadoService;

    public FiadoController(IFiadoService fiadoService) {
        this.fiadoService = fiadoService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Fiado obtenerFiado(@PathVariable("id") UUID id) {
        return fiadoService.obtenerFiado(id);
    }

    @PostMapping()
    public void crearFiado(@Valid @RequestBody Fiado fiado) {
        fiadoService.crearFiado(fiado);
    }

}
