package com.viniciusrvk.mcp_server_viacep.client;

import com.viniciusrvk.mcp_server_viacep.dto.CepResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class ViaCepClient {

    private final WebClient.Builder webClientBuilder;

    public Mono<CepResponse> addressByCep(String cep) {
        return webClientBuilder.build()
                .get()
                .uri("https://viacep.com.br/ws/{cep}/json/", cep)
                .retrieve()
                .bodyToMono(CepResponse.class);
    }
}
