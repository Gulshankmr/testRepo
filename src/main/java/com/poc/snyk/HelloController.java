package com.poc.snyk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello, I am a Spring Boot app with Snyk integration!";
    }

    @GetMapping("/name")
    public String TEST_NAMING_CONVENION() {
        String userName = "userName";
        String password = "password";
        String x = "HELLO_WORLD";
        return x;
    }

    @PostMapping("/")
    public int TEST_Exception() {
        int x = 5 / 0;
        return x;
    }

    @PostMapping("/try")
    public int TEST_tryCatch() {
        try {
            int x = 5 / 0;
            return x;
        } catch (Exception ex) {
        }
        return 0;
    }
}
