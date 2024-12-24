package exception;

public class NotAllowableBoatSize extends Exception {
    private String details;
    public NotAllowableBoatSize(String message, String details) {

        super(message);
        this.details = details;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + ": " + details;
    }
}
