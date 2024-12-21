package com.devromaomoura.busca_endereco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BuscaEnderecoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuscaEnderecoApplication.class, args);
	}

}
