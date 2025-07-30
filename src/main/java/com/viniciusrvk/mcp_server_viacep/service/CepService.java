package com.viniciusrvk.mcp_server_viacep.service;

import com.viniciusrvk.mcp_server_viacep.client.ViaCepClient;
import com.viniciusrvk.mcp_server_viacep.dto.CepResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CepService {

    private final ViaCepClient viaCepClient;

    @Tool(description = "Consulta de endereço via CEP")
    public CepResponse getCep(@ToolParam(description = "CEP, e.g., 59154310") String cep){
        final var cepTratado = cep.replaceAll("[^0-9]", "");
        return viaCepClient.getCep(cepTratado);
    }
}
