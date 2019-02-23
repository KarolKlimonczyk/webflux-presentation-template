package com.jvmfy.webflux.reactor;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
public class ReactorSamples {

    private static String[] CARS = new String[]{
            "AUDI", "BMW", "HONDA", "MITSUBISHI"
    };

    private static String getCarByIndex(int index) {
        return CARS[index];
    }


    public static void main(String[] args) throws IOException, InterruptedException {

        new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}

