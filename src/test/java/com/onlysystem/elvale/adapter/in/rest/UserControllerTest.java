package com.onlysystem.elvale.adapter.in.rest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.onlysystem.elvale.usuario.adapter.in.rest.UsuarioController;
import com.onlysystem.elvale.usuario.domain.model.Usuario;
import com.onlysystem.elvale.usuario.domain.service.IUsuarioService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UsuarioController.class)
class UserControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    private IUsuarioService usuarioService;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
/*
    @Test
    void whenGetRequest_thenReturnsOkStatus() throws Exception {
        String userId = "1";
        String nombre = "Juan";
        String email = "farid@gmail.com";
        String rol = "ADMIN";

        Usuario usuario = new Usuario(userId, nombre, email, rol);
        when(usuarioService.obtenerUsuario(userId)).thenReturn(usuario);

        mockMvc.perform(get("/api/usuarios/{id}", userId)
                .contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isOk());
    }

    @Test
    void whenInvalidRequest_thenReturnsBadRequest() throws Exception {
        mockMvc.perform(post("/api/usuarios")
               .contentType(MediaType.APPLICATION_JSON)
               .content("{\"invalidField\": \"value\"}"))
               .andExpect(status().isBadRequest());
    }

    */
               
}