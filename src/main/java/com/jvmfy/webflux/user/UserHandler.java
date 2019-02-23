package com.jvmfy.webflux.user;

import com.jvmfy.webflux.ascii.AsciiArtService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@AllArgsConstructor
@Component
public class UserHandler {

    private final UserRepository userRepository;
    private final AsciiArtService asciiArtService;

}
