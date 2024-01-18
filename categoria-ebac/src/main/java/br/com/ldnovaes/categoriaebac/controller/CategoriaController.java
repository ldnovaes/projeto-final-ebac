package br.com.ldnovaes.categoriaebac.controller;

import br.com.ldnovaes.categoriaebac.entity.Categoria;
import br.com.ldnovaes.categoriaebac.service.CategoriaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/categoria", produces = {"application/json"}, consumes = {"application/json"})
@Tag(name = "categoria-service")
public class CategoriaController {

    CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @Operation(summary = "Realiza a busca de categorias cadastradas pelos usuários", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Não encontrado resultado")
    })
    @GetMapping(produces = "application/json")
    public List<Categoria> findAll() {
        return this.service.findAll();
    }

    @Operation(summary = "Realiza a busca de uma categoria através de um id", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Não encontrado resultado")
    })
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Categoria> findById(@PathVariable Long id) {
        return this.service.findById(id)
                .map(found -> ResponseEntity.ok().body(found))
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Realiza a busca de categorias através de um nome", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Não encontrado resultado")
    })
    @GetMapping(value = "/nome/{nome}", produces = "application/json")
    public List<Categoria> findByNome(@PathVariable String nome) {
        return this.service.findAllByNome(nome);
    }

    @Operation(summary = "Realiza a busca de categorias de um usuário", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Não encontrado resultado")
    })
    @GetMapping(value = "/usuario/{idUsuario}", produces = "application/json")
    public List<Categoria> findByIdUsuario(@PathVariable String idUsuario) {
        return this.service.findAllByIdUsuario(idUsuario);
    }

    @Operation(summary = "Realiza a POST de uma nova CATEGORIA", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "202", description = "Salvamento ocorreu com sucesso"),
    })
    @PostMapping(consumes = "application/json")
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoria) {
        return new ResponseEntity<>(service.save(categoria), HttpStatus.CREATED);
    }

}
