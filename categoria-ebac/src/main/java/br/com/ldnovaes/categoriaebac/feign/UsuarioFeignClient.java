package br.com.ldnovaes.categoriaebac.feign;

import br.com.ldnovaes.categoriaebac.dto.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "usuario-service", url = "http://localhost:8082/api/usuario")
public interface UsuarioFeignClient {

    @GetMapping("/{id}")
    public UsuarioDTO findById(@PathVariable String id);

}
