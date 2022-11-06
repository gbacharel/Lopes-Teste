package com.lopes.producerservice.service.impl;

import com.lopes.producerservice.model.ServicoProducer;
import com.lopes.producerservice.service.ServicoService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@RequiredArgsConstructor
@Log4j2
@Service
public class ServicoServiceImpl implements ServicoService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @SneakyThrows
    @Override
    public void sendServico(ServicoProducer servicoProducer) {

        log.info( "Recebi o solicitação {}", servicoProducer);
        Thread.sleep(1000);

        log.info("Enviando solicitação...");
        kafkaTemplate.send("service-topic", servicoProducer);

    }
}
