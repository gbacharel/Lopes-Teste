package com.lopes.apiservico.data;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ServicoDto {
    @NotBlank
    private String profName;
}
