package Calculator;

public class Division extends OperationMethod implements FunctionF {

    public Division(double firstOperand, double secondOperand) {
        super(firstOperand, secondOperand);
    }

    public Division() {}

    @Override
    public double f() {
        return getFirstOperand() / getSecondOperand();
    }

    @Override
    public String toString() {
        return String.format("%.1f / %.1f = %.1f", getFirstOperand(), getSecondOperand(), f());
    }
}