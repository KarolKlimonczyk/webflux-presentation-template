package com.jvmfy.webflux.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class UserRouter {

    @Bean
    public RouterFunction<ServerResponse> route(UserHandler userHandler) {
        return null;
    }
}
