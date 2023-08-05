import java.util.logging.Logger;

public class ComplexCalculator {
    private static Logger logger = Logger.getLogger(ComplexCalculator.class.getName());

    private ComplexOperation operation;

    public ComplexCalculator(ComplexOperation operation) {
        this.operation = operation;
    }

    public Complex calculate(Complex number1, Complex number2) {
        logger.info("Вычисление...");
        Complex result = operation.perform(number1, number2);
        logger.info("Результат: " + result.getReal() + " + " + result.getImaginary() + "i");
        return result;
    }

    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
    }
}
