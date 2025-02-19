package com.onlysystem.elvale.usuario.adapter.in.rest;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.Map;
import java.util.HashMap;
import jakarta.validation.Valid;
import com.onlysystem.elvale.usuario.domain.model.Usuario;
import com.onlysystem.elvale.usuario.domain.service.IUsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final IUsuarioService usuarioService;

    public UsuarioController(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> obtenerUsuario(@PathVariable("id") String id) {
        try {
            if (id == null || id.trim().isEmpty()) {
                Map<String, Object> response = new HashMap<>();
                response.put("status", HttpStatus.BAD_REQUEST.value());
                response.put("mensaje", "El ID del usuario no puede estar vacío");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
            }

            Usuario usuario = usuarioService.obtenerUsuario(id);
            Map<String, Object> response = new HashMap<>();

            if (usuario == null) {
                response.put("status", HttpStatus.NOT_FOUND.value());
                response.put("mensaje", "No se encontró el usuario con ID: " + id);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
            }

            response.put("status", HttpStatus.OK.value());
            response.put("mensaje", "Usuario encontrado exitosamente");
            response.put("data", usuario);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            Map<String, Object> response = new HashMap<>();
            response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("mensaje", "Error interno del servidor: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @PostMapping()
    public void crearUsuario(@Valid @RequestBody Usuario usuario) {
        usuarioService.crearUsuario(usuario);
    }

}
