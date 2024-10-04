package com.poc.snyk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.DriverManager;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        int sportType = 2;
        boolean isSubstitute = true;
        boolean isSelected = false;
        int score = 0;
        switch (sportType) {
            case 2: {
                if (isSubstitute) {
                    score += 2;
                } else if (isSelected) {
                    score += 4;
                }
            }
            case 3: {
                if (isSubstitute) {
                    score += 4;
                } else if (isSelected) {
                    score += 8;
                }
            }
            default: {
            }
        }
        return "Hello, I am a Spring Boot app with Snyk integration! " + score;
    }

    @GetMapping("/name")
    public String TEST_NAMING_CONVENION() {
        String userName = "userName";
        String password = "password";
        System.out.println(userName + " " + password);
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

    @PostMapping("/creds")
    public int hardcodeCreds() {
        try {
            String serverip = "localhost";
            String serverport = "1433";
            String url = "jdbc:sqlserver://" + serverip + "\\SQLEXPRESS:" + serverport + ";databaseName=" + "test" + "";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            DriverManager.getConnection(url, "admin", "qwerty");
        } catch (Exception ex) {
        }
        return 0;
    }
}
