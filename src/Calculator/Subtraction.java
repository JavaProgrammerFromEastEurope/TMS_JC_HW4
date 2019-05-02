package Calculator;

public class Subtraction extends OperationMethod implements FunctionF {


    public Subtraction(double firstOperand, double secondOperand) {
        super(firstOperand, secondOperand);
    }

    public Subtraction() {}

    @Override
    public double f() {
        return getFirstOperand() - getSecondOperand();
    }

    @Override
    public String toString() {
        return String.format("%.1f - %.1f = %.1f",getFirstOperand(),getSecondOperand(),f());
    }
}
