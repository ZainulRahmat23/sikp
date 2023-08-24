package com.example.mockApi.domain.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ResponseSendDataAkadDto {
    private boolean error;
    private String code,message;
    private int countAkad;
//    "{\"error\":false,\"code\":\"00\",\"message\":\"Data berhasil ditambahkan.\",\"count_akad\":1}"
}
