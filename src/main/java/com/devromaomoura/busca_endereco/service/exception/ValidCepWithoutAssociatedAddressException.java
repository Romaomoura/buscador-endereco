package com.devromaomoura.busca_endereco.service.exception;

public class ValidCepWithoutAssociatedAddressException extends RuntimeException{
    public ValidCepWithoutAssociatedAddressException() {
        super("CEP válido, mas sem endereço associado.");
    }
}