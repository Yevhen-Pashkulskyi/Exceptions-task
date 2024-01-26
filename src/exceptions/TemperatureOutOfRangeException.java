package exceptions;

public class TemperatureOutOfRangeException extends RuntimeException{
    public TemperatureOutOfRangeException(String message) {
        super(message);
    }
}
