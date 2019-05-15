package Calculator;

import static java.lang.System.*;

public class Division extends OperationMethod implements IFunctionF {

    public Division(double firstOperand, double secondOperand) {
        super(firstOperand, secondOperand);
    }

    public Division() {
    }

    @Override
    public double f() {
        if (getSecondOperand() == 0) {
            return 0;
        } else {
            return getFirstOperand() / getSecondOperand();
        }
    }

    @Override
    public String toString() {
        if (getSecondOperand() == 0) {
            return "Division by zero is not allowed!";
        } else {
            return String.format("%.1f / %.1f = %.1f", getFirstOperand(), getSecondOperand(), f());
        }
    }
}