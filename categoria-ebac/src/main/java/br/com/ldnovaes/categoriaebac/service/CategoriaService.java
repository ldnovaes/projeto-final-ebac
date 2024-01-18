package br.com.ldnovaes.categoriaebac.service;

import br.com.ldnovaes.categoriaebac.dto.UsuarioDTO;
import br.com.ldnovaes.categoriaebac.entity.Categoria;
import br.com.ldnovaes.categoriaebac.feign.UsuarioFeignClient;
import br.com.ldnovaes.categoriaebac.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    CategoriaRepository repo;
    UsuarioFeignClient usuarioFeignClient;

    public CategoriaService(CategoriaRepository repo, UsuarioFeignClient usuarioFeignClient) {
        this.repo = repo;
        this.usuarioFeignClient = usuarioFeignClient;
    }

    public List<Categoria> findByNome(String nome) {
        return this.repo.findByNome(nome);
    }

    public List<Categoria> findAll() {
        return this.repo.findAll();
    }

    public Categoria save(Categoria categoria) {
        return this.repo.save(categoria);
    }

    public Optional<Categoria> findById(Long id) {
        return this.repo.findById(id);
    }

    public List<Categoria> findAllByIdUsuario(String id) {
        return this.repo.findByIdUsuario(id);
    }

    public List<Categoria> findAllByNome(String nome) {
        return this.repo.findByNome(nome);
    }
}
