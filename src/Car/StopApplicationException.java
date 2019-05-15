package Car;

import example.examples.Car;

public class StopApplicationException extends Exception {
    @Override
    public String getMessage() {
        return "Exception confirmed!";
    }
}
