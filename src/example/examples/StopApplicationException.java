package example.examples;

public class StopApplicationException extends Exception {
    @Override
    public String getMessage() {
        return "Exception confirmed!";
    }
}
