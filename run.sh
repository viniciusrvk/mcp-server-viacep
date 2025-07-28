#!/bin/bash

# ajustando diretório do arquivo app.jar para funcionar de acordo com o DockerFile do ambiente coolify
JAR_FILE="./app.jar" # O JAR agora está diretamente em /app, renomeado para app.jar

# Verifica se o arquivo JAR foi encontrado.
# O `find` não é mais necessário, apenas verificar se o arquivo existe.
if [ ! -f "$JAR_FILE" ]; then
    echo "Erro: Arquivo JAR não encontrado em '$JAR_FILE'."
    exit 1
fi

echo "Executando a aplicação: $JAR_FILE"
# Executa o JAR da aplicação Spring Boot.
java -jar  "$JAR_FILE"