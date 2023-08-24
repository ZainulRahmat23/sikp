package com.example.mockApi.util;

import com.example.mockApi.domain.dto.RequestSendDataAkadDto;
import com.example.mockApi.domain.dto.ResponseSendDataAkadDto;
import com.example.mockApi.service.MappingServices;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MappingServicesImpl implements MappingServices {
    @Override
    public ResponseEntity<Object> getDukcapil(HttpServletRequest request, RequestSendDataAkadDto dto) {
        ResponseSendDataAkadDto response = new ResponseSendDataAkadDto();
        response.setCode("00");
        response.setError(false);
        response.setMessage("Data berhasil ditambahkan.");
        response.setCountAkad(1);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
