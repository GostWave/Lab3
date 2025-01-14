package exception;

public class NotAllowableSizeException extends Exception {
    final String details;

    public NotAllowableSizeException(String message, String details) {
        super(message);
        this.details = details;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + ": " + details;
    }
}