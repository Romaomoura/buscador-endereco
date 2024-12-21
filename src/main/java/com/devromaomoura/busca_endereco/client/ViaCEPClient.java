package com.devromaomoura.busca_endereco.client;

import com.devromaomoura.busca_endereco.domain.dto.EnderecoRecord;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viaCEPClient", url = "${via-cep.base-url}")
public interface ViaCEPClient {

    @GetMapping(value = "/{cep}/json", consumes = "application/json", produces = "application/json")
    EnderecoRecord buscaEndereco(@PathVariable("cep") String cep);
}

