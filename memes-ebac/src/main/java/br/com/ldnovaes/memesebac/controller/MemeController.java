package br.com.ldnovaes.memesebac.controller;

import br.com.ldnovaes.memesebac.entity.Meme;
import br.com.ldnovaes.memesebac.producer.NotificadorNovoMeme;
import br.com.ldnovaes.memesebac.service.MemeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/meme", produces = {"application/json"})
@Tag(name = "meme-servico")
public class MemeController {

    private MemeService service;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private NotificadorNovoMeme notificadorNovoMeme;

    public MemeController(MemeService service, NotificadorNovoMeme notificadorNovoMeme) {
        this.service = service;
        this.notificadorNovoMeme = notificadorNovoMeme;
    }

    @Operation(summary = "Realiza a busca de memes cadastrados pelos usuários", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Não encontrado resultado")
    })
    @GetMapping(produces = "application/json")
    public ResponseEntity<Page<Meme>> findAll(@RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "10") int size) {
        return this.service.findAll(page, size)
                .map(found -> ResponseEntity.ok().body(found))
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Realiza a busca de um meme através de um id", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Não encontrado resultado")
    })
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Meme> findById(@PathVariable String id) {
        return this.service.findById(id)
                .map(found -> ResponseEntity.ok().body(found))
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Realiza a busca de memes através de um id de CATEGORIA", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Não encontrado resultado")
    })
    @GetMapping(value = "/categoria/{id}", produces = "application/json")
    public ResponseEntity<List<Meme>> findByCategoriaId(@PathVariable Long id) {
        return this.service.findByIdCategoria(id)
                .map(found -> ResponseEntity.ok().body(found))
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Realiza a POST de um novo Meme", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "202", description = "Salvamento ocorreu com sucesso"),
    })
    @PostMapping(consumes = "application/json")
    public ResponseEntity<Meme> save(@RequestBody Meme meme) {
        Meme savedMeme = this.service.save(meme);
        logger.info("Salvo um novo meme no banco");
        this.notificadorNovoMeme.enviarMensagem("Novo meme adicionado!");
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMeme);
    }
}
