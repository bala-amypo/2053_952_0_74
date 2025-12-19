package com.example.demo.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> hello(MethodArgumentNotValidException ex) {
        Map<String,String> map=new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error->map.put(err))
    }

    @ExceptionHandler(PasswordNotMatchCri.class)
    public String hi() {
        return "Password not matched";
    }
}
