package Calculator;

public class Addition extends OperationMethod implements IFunctionF {


    public Addition(double firstOperand, double secondOperand) {
        super(firstOperand, secondOperand);
    }

    public Addition() {}

    @Override
    public double f() {
        return getFirstOperand() + getSecondOperand();
    }

    @Override
    public String toString() {
        return String.format("%.1f + %.1f = %.1f",getFirstOperand(),getSecondOperand(),f());
    }
}