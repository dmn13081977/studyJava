package my.springboot.exception;

public class UserNotfoundException extends Exception{
    public UserNotfoundException(String message) {
        super(message);
    }
}
