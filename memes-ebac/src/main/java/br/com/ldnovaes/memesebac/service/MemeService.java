package br.com.ldnovaes.memesebac.service;

import br.com.ldnovaes.memesebac.dto.CategoriaDTO;
import br.com.ldnovaes.memesebac.entity.Meme;
import br.com.ldnovaes.memesebac.feign.CategoriaFeignClient;
import br.com.ldnovaes.memesebac.repository.MemeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemeService {

    private MemeRepository repo;

    private CategoriaFeignClient categoriaFeignClient;

    public MemeService(MemeRepository repo, CategoriaFeignClient categoriaFeignClient) {
        this.repo = repo;
        this.categoriaFeignClient = categoriaFeignClient;
    }

    public Optional<Meme> findById(String id) {
        return this.repo.findById(id);
    }

    public Optional<Page<Meme>> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("dataCadastro").descending());
        return Optional.of(this.repo.findAll(pageable));
    }

    public Meme save(Meme meme) {
        return this.repo.save(meme);
    }

    public Optional<List<Meme>> findByIdCategoria(Long id) {
        CategoriaDTO categoria = this.categoriaFeignClient.findByCategoriaId(id);
        return Optional.of(this.repo.findByIdCategoria(categoria.getId()));
    }
}
