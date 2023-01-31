package lesson08;

public class WrongLoginException extends RuntimeException {

    public WrongLoginException(String message) {
        super(message);
    }
}
