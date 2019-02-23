package com.jvmfy.webflux.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
public class Client {

    private final WebClient webClient;

    public Client(WebClient webClient) {
        this.webClient = webClient;
    }

    public void fetchAscii() {
    }
}
