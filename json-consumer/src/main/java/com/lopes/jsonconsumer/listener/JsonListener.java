package com.lopes.jsonconsumer.listener;

import com.lopes.jsonconsumer.custom.JsonConsumerCustomListener;
import com.lopes.jsonconsumer.model.ServicoCosumer;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@RequiredArgsConstructor
@Log4j2
@Component
public class JsonListener {


    @SneakyThrows
    @JsonConsumerCustomListener(groupId = "solicitacao-group")
    public void validSolicitacao(@Payload ServicoCosumer servicoCosumer){
        log.info("Solicitaçao Recebida Numero do serviço {}", servicoCosumer.getIdService());
        log.info("Validando Solicitação...");
        sleep(2000);

        log.info("Solicitação Aprovada...");
        sleep(3000);

        log.info("Devolvendo solicitação...");
        sleep(4000);
    }

}