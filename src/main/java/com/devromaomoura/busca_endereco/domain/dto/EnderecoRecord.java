package com.devromaomoura.busca_endereco.domain.dto;

import lombok.Builder;

@Builder
public record EnderecoRecord(
        String cep,
        String logradouro,
        String complemento,
        String unidade,
        String bairro,
        String localidade,
        String uf,
        String estado,
        String regiao,
        String ibge,
        String gia,
        String ddd,
        String siafi
) {}

