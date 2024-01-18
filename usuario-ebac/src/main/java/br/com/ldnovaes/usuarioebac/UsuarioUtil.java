package br.com.ldnovaes.usuarioebac;

import br.com.ldnovaes.usuarioebac.dto.UsuarioDTO;
import br.com.ldnovaes.usuarioebac.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioUtil {

    public static UsuarioDTO transformToDTO(Usuario usuario) {
        return UsuarioDTO.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .dataCadastro(usuario.getDataCadastro())
                .build();
    }

    public static List<UsuarioDTO> transformListToDTO(List<Usuario> usuarios) {
        
        List<UsuarioDTO> usuariosDTOs = new ArrayList<>();
        
        for(Usuario usuario : usuarios) {
            usuariosDTOs.add(UsuarioDTO.builder()
                    .id(usuario.getId())
                    .nome(usuario.getNome())
                    .dataCadastro(usuario.getDataCadastro())
                    .build()
            );
        }

        return usuariosDTOs;
    }
}
