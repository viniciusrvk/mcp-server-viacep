package com.viniciusrvk.mcp_server_viacep;

import com.viniciusrvk.mcp_server_viacep.service.CepService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class McpServerViacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpServerViacepApplication.class, args);
	}

	@Bean
	public ToolCallbackProvider cepTool(CepService cepService) {
		return  MethodToolCallbackProvider.builder().toolObjects(cepService).build();
	}
}
