package com.example.demo.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // Handles validation errors
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleValidationException(MethodArgumentNotValidException ex) {
        return "Validation failed";
    }

    // Handles custom password exception
    @ExceptionHandler(PasswordNotMatchCri.class)
    public String handlePasswordException(PasswordNotMatchCri ex) {
        return "Password not matched";
    }
}
