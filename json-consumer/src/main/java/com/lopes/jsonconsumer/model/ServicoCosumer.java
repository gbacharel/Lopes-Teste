package com.lopes.jsonconsumer.model;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Getter

public class ServicoCosumer implements Serializable {
    private static final long serialVersionUID = 1l;

    private Long id;
    private Long idService;

    }

