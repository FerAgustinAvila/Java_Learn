package org.ferdev.junitapp.exceptions;

public class AmountInsufficientException extends RuntimeException{
    public AmountInsufficientException(String message) {
        super(message);
    }
}
