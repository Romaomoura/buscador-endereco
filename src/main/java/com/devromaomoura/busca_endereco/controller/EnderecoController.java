package com.devromaomoura.busca_endereco.controller;

import com.devromaomoura.busca_endereco.controller.validator.ValidCep;
import com.devromaomoura.busca_endereco.domain.dto.EnderecoRecord;
import com.devromaomoura.busca_endereco.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/endereco")
@CrossOrigin(origins = "*")
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
