package org.example.v1_0_0.exceptions;

public class TemperatureOutOfRangeException extends RuntimeException{
    public TemperatureOutOfRangeException(String message) {
        super(message);
    }
}
