public class ComplexCalculator {
    private ComplexOperation operation;

    public ComplexCalculator(ComplexOperation operation) {
        this.operation = operation;
    }

    public Complex calculate(Complex number1, Complex number2) {
        AppLogger.logInfo("Вычисляю.");
        Complex result = operation.perform(number1, number2);
        AppLogger.logInfo("Ответ: " + result.getReal() + " + " + result.getImaginary() + "i");
        return result;
    }

    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
    }
}
