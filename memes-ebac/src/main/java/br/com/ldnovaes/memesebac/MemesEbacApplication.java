package br.com.ldnovaes.memesebac;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MemesEbacApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemesEbacApplication.class, args);
	}

}
