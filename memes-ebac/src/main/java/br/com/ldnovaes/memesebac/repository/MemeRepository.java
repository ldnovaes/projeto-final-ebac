package br.com.ldnovaes.memesebac.repository;

import br.com.ldnovaes.memesebac.entity.Meme;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MemeRepository extends MongoRepository<Meme, String> {

    public List<Meme> findByIdCategoria(Long id);
}
