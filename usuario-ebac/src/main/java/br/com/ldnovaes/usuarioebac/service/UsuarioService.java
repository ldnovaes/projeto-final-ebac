package br.com.ldnovaes.usuarioebac.service;

import br.com.ldnovaes.usuarioebac.UsuarioUtil;
import br.com.ldnovaes.usuarioebac.dto.UsuarioDTO;
import br.com.ldnovaes.usuarioebac.entity.Usuario;
import br.com.ldnovaes.usuarioebac.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public List<UsuarioDTO> findAll() {
        return UsuarioUtil.transformListToDTO(this.repo.findAll());
    }

    public Optional<UsuarioDTO> findById(String id) {
        Usuario usuario = this.repo.findById(id).get();
        return Optional.ofNullable(UsuarioUtil.transformToDTO(usuario));
    }

    public UsuarioDTO save(Usuario usuario) {
        Usuario usuarioSave = this.repo.save(usuario);
        return UsuarioUtil.transformToDTO(usuario);
    }
}
