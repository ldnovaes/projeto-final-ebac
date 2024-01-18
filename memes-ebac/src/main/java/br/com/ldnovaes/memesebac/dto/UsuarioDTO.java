package br.com.ldnovaes.memesebac.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class UsuarioDTO {

    private String id;

    private String nome;

    private Date dataCadastro;
}
