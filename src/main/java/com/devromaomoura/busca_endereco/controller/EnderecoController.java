package com.devromaomoura.busca_endereco.controller;

import com.devromaomoura.busca_endereco.controller.validator.ValidCep;
import com.devromaomoura.busca_endereco.domain.dto.EnderecoRecord;
import com.devromaomoura.busca_endereco.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
@Validated
public class EnderecoController {

    private final EnderecoService enderecoService;

    @Autowired
    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping(value = "/buscar/{cep}")
    public ResponseEntity<EnderecoRecord> buscaEndereco(@PathVariable("cep") @ValidCep String cep){
        EnderecoRecord enderecoEncontrado = enderecoService.buscarPorCEP(cep);
        return ResponseEntity.ok(enderecoEncontrado);
    }
}
