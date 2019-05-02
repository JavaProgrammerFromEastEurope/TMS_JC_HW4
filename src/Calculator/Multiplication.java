package Calculator;

public class Multiplication extends OperationMethod implements FunctionF {


    public Multiplication(double firstOperand, double secondOperand) {
        super(firstOperand, secondOperand);
    }

    public Multiplication() {}

    @Override
    public double f() {
        return getFirstOperand() * getSecondOperand();
    }

    @Override
    public String toString() {
        return String.format("%.1f * %.1f = %.1f",getFirstOperand(),getSecondOperand(),f());
    }
}
