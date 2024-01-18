package br.com.ldnovaes.categoriaebac.repository;

import br.com.ldnovaes.categoriaebac.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    List<Categoria> findByNome(String nome);

    List<Categoria> findByIdUsuario(String id);
}
