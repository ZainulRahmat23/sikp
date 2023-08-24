package com.example.mockApi.service;

import com.example.mockApi.domain.dto.RequestSendDataAkadDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;


public interface MappingServices {
    ResponseEntity<Object> getDukcapil(HttpServletRequest request, RequestSendDataAkadDto dto);
}
