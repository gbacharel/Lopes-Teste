package com.lopes.apiservico.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "TB_PROFISSICOES")
public class ServicoModels implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long profId;
    @Column(nullable = false)
    private String profName;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;
}
