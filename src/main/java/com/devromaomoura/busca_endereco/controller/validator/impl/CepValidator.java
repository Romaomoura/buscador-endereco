package com.devromaomoura.busca_endereco.controller.validator.impl;

import com.devromaomoura.busca_endereco.controller.validator.ValidCep;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CepValidator implements ConstraintValidator<ValidCep, String> {

    private static final String CEP_REGEX = "\\d{8}";

    @Override
    public boolean isValid(String cep, ConstraintValidatorContext context) {
        return cep != null && cep.matches(CEP_REGEX);
    }
}
