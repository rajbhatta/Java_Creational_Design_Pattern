package exception;

public class ComosDbCrudException extends Exception {
    public ComosDbCrudException(String message) {
        super(message);
    }

    public ComosDbCrudException(String message, Throwable cause) {
        super(message, cause);
    }
}
