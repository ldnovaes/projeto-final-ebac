package br.com.ldnovaes.memesebac.feign;

import br.com.ldnovaes.memesebac.dto.CategoriaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "categoria-service", url = "http://localhost:8081/api/categoria")
public interface CategoriaFeignClient {

    @GetMapping("/{id}")
    public CategoriaDTO findByCategoriaId(@PathVariable Long id);

}
