package com.devromaomoura.busca_endereco.service;

import com.devromaomoura.busca_endereco.client.ViaCEPClient;
import com.devromaomoura.busca_endereco.domain.dto.EnderecoRecord;
import com.devromaomoura.busca_endereco.service.exception.CepNotFoundException;
import com.devromaomoura.busca_endereco.service.exception.ValidCepWithoutAssociatedAddressException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService {

    private final ViaCEPClient viaCEPClient;

    @Autowired
    public EnderecoService(ViaCEPClient viaCEPClient) {
        this.viaCEPClient = viaCEPClient;
    }

    public EnderecoRecord buscarPorCEP(String cep){
        var enderecoEncontrado =  Optional.ofNullable(viaCEPClient.buscaEndereco(cep))
                .orElseThrow(CepNotFoundException::new);

        isValidEndereco(enderecoEncontrado);

        return enderecoEncontrado;
    }

    private static void isValidEndereco(EnderecoRecord enderecoEncontrado) {
        if (null == enderecoEncontrado.cep()) throw new ValidCepWithoutAssociatedAddressException();
    }
}
