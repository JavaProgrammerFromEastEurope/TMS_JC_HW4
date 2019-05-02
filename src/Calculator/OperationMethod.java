package Calculator;

public abstract class OperationMethod {

    private double firstOperand;
    private double secondOperand;

    public OperationMethod(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public OperationMethod() {}

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public double getFirstOperand() {
        return firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }
}