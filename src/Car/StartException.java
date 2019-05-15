package Car;

public class StartException extends Exception {
    @Override
    public String getMessage() {
        return "Exception confirmed!";
    }
}
