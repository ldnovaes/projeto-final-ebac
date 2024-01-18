package br.com.ldnovaes.memesebac.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Getter
@Setter
public class Meme {

    @Id
    private String id;

    private String nome;

    private String descricao;

    private Date dataCadastro;

    private Long idCategoria;

    private String idUsuario;
}
