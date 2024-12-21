package com.devromaomoura.busca_endereco.controller.validator;

import com.devromaomoura.busca_endereco.controller.validator.impl.CepValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CepValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidCep {

    String message() default "CEP inválido. Deve conter exatamente 8 dígitos numéricos.";
    
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
