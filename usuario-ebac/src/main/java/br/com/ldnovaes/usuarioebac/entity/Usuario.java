package br.com.ldnovaes.usuarioebac.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "usuarios")
@Getter
@Setter
@Builder
public class Usuario {

    @Id
    private String id;

    private String nome;

    private String email;

    private Date dataCadastro;
}
