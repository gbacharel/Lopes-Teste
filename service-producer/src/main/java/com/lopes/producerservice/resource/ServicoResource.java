package com.lopes.producerservice.resource;

import com.lopes.producerservice.model.ServicoProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ServicoResource {

    @PostMapping
    ResponseEntity<String> servico(@RequestBody ServicoProducer servicoProducer);
}
