package com.example.utils;

public class ConfigReader {

    public static String getUsername() {
        String username = System.getenv("APP_USERNAME");
        if (username == null || username.isBlank()) {
            username = "default_user";
        }
        return username;
    }

    public static String getPassword() {
        String password = System.getenv("APP_PASSWORD");
        if (password == null || password.isBlank()) {
            password = "default_password";
        }
        return password;
    }
}