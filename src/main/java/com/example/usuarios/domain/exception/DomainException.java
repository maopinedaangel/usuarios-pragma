package com.example.usuarios.domain.exception;

public class DomainException extends RuntimeException{
    public DomainException(String message) {
        super(message);
    }
}
