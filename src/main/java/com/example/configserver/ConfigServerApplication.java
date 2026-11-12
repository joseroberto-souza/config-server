package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Inicia a aplicação do servidor de configurações (Config Server).
 * Este serviço centraliza e distribui os arquivos de configuração do repositório Git para todos os microsserviços.
 */
@SpringBootApplication // Habilita a configuração automática e a inicialização do Spring Boot.
@EnableConfigServer // Ativa o servidor de configuração para ler e servir propriedades externas.
public class ConfigServerApplication {

    /**
     * Executa o ponto de entrada principal da aplicação Java.
     *
     * @param args Argumentos de linha de comando passados na inicialização.
     */
    public static void main(String[] args) {
        // Inicia o contexto do Spring e sobe o servidor na porta configurada.
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
