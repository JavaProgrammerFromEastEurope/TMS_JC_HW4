package Calculator;

public class Power extends OperationMethod implements IFunctionF {


    public Power(double firstOperand, double secondOperand) {
        super(firstOperand, secondOperand);
    }

    public Power() {}

    @Override
    public double f() {
        return Math.pow(getFirstOperand(),getSecondOperand()) ;
    }

    @Override
    public String toString() {
        return String.format("%.1f ^ %.1f = %.1f",getFirstOperand(),getSecondOperand(),f());
    }
}