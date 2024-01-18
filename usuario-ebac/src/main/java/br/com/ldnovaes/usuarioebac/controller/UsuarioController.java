package br.com.ldnovaes.usuarioebac.controller;

import br.com.ldnovaes.usuarioebac.dto.UsuarioDTO;
import br.com.ldnovaes.usuarioebac.entity.Usuario;
import br.com.ldnovaes.usuarioebac.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @Operation(summary = "Realiza a busca de usuários cadastrados pelos usuários", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Não encontrado resultado")
    })
    @GetMapping(produces = "application/json")
    public List<UsuarioDTO> findAll() {
        return this.service.findAll();
    }

    @Operation(summary = "Realiza a busca de um usuário através de um id", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Não encontrado resultado")
    })
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<UsuarioDTO> findById(@PathVariable String id) {
        return this.service.findById(id)
                .map(found -> ResponseEntity.ok().body(found))
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Realiza a POST de um novo usuário", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "202", description = "Salvamento ocorreu com sucesso"),
    })
    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO save(@RequestBody Usuario usuario) {
        return this.service.save(usuario);
    }


}
