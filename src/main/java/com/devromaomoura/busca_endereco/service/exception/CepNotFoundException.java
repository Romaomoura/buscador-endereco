package com.devromaomoura.busca_endereco.service.exception;

public class CepNotFoundException extends RuntimeException{
    public CepNotFoundException() {
        super("CEP não encontrado.");
    }
}

