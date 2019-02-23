package com.jvmfy.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@EnableCassandraRepositories
@SpringBootApplication
public class WebfluxApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(WebfluxApplication.class, args);

//        Client client = new Client(WebClient.create("http://localhost:8080"));
//        client.fetchAscii();
    }
}