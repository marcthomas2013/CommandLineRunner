package com.mtdevuk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The name property must be defaulted in application.properties, then it can be overridden in an application.properties
 * file external to your application jar, or passed in via the command line with the parameter --name="Another Name"
 */
@SpringBootApplication
public class CommandLineDemoApplication implements CommandLineRunner {

    // Use @Value to inject the property of the name "name" to nameParameter, this can be done anywhere in your app.
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
