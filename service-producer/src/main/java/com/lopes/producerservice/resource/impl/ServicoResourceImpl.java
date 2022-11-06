package com.lopes.producerservice.resource.impl;

import com.lopes.producerservice.model.ServicoProducer;
import com.lopes.producerservice.resource.ServicoResource;
import com.lopes.producerservice.service.ServicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/mensagem-servico")

public class ServicoResourceImpl implements ServicoResource {

    private final ServicoService servicoService;
    @Override
    public ResponseEntity<String> servico(ServicoProducer servicoProducer) {
        servicoService.sendServico(servicoProducer);
        return ResponseEntity.status(HttpStatus.CREATED).body("Solicitação Enviada");
    }

}
