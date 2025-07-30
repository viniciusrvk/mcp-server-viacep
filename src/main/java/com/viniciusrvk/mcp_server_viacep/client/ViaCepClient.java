package com.viniciusrvk.mcp_server_viacep.client;

import com.viniciusrvk.mcp_server_viacep.dto.CepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "viaCepClient", url = "https://viacep.com.br/ws")
public interface ViaCepClient {

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    CepResponse getCep(@PathVariable("cep") String cep);

}
