package com.example.demo.exception;

public class PasswordNotMatchCri extends RuntimeException {

    public PasswordNotMatchCri(String message) {
        super(message);
    }
}
