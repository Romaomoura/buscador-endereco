package com.devromaomoura.busca_endereco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EnderecoViewController {

    @GetMapping
    public String carregarPaginaEndereco() {
        return "endereco";
    }
}
