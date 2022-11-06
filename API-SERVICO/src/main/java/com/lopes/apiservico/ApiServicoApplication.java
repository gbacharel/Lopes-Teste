package com.lopes.apiservico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ApiServicoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiServicoApplication.class, args);
    }


}
