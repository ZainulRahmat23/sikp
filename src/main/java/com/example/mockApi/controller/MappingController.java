package com.example.mockApi.controller;

import com.example.mockApi.domain.dto.RequestSendDataAkadDto;
import com.example.mockApi.service.MappingServices;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/field")
public class MappingController {
    @Autowired
    private MappingServices services;
    @GetMapping("/sendDataAkad")
    public ResponseEntity<Object>getDukcapil(HttpServletRequest request, @RequestBody RequestSendDataAkadDto dto){
        return services.getDukcapil(request,dto);
    }
}
