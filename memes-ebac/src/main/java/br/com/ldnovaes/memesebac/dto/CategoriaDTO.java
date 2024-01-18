package br.com.ldnovaes.memesebac.dto;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CategoriaDTO {

    private Long id;

    private String nome;

    private Date dataCadastro;

    private String idUsuario;

}
