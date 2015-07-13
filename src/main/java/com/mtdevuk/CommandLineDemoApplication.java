package com.mtdevuk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineDemoApplication implements CommandLineRunner {
    @Value("${name}")
    private String nameParameter;

    public static void main(String[] args) {
        SpringApplication.run(CommandLineDemoApplication.class, args);
    }

    @Override
    public void run(String... commandLineParams) throws Exception {
        System.out.println("Parameter passed into name was: " + nameParameter);

        for (String commandLine : commandLineParams) {
            System.out.println(commandLine);
        }
    }
}
