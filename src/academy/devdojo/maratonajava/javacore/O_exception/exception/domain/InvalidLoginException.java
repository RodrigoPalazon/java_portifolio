package academy.devdojo.maratonajava.javacore.O_exception.exception.domain;

public class InvalidLoginException extends Exception{
    public InvalidLoginException() {
        super("Invalid Login");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}
