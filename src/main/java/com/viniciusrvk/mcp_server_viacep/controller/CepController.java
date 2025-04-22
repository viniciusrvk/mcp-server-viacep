package com.viniciusrvk.mcp_server_viacep.controller;

import com.viniciusrvk.mcp_server_viacep.dto.CepResponse;
import com.viniciusrvk.mcp_server_viacep.service.CepService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
@RequiredArgsConstructor
public class CepController {

    private final CepService cepService;

    @GetMapping(path = "/{cep}")
    public ResponseEntity<CepResponse> getCep(@PathVariable String cep) {
        return ResponseEntity.ok(cepService.getCep(cep));
    }
}
