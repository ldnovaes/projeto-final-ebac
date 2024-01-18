package br.com.ldnovaes.categoriaebac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CategoriaEbacApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoriaEbacApplication.class, args);
	}

}
