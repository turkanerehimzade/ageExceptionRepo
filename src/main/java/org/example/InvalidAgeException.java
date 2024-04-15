package org.example;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String massage) {
        super(massage);
    }
}
