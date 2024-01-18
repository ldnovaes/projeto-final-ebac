package br.com.ldnovaes.usuarioebac.repository;

import br.com.ldnovaes.usuarioebac.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
