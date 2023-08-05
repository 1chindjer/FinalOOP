public class ComplexSubtraction implements ComplexOperation {
    @Override
    public Complex perform(Complex number1, Complex number2) {
        double real = number1.getReal() - number2.getReal();
        double imaginary = number1.getImaginary() - number2.getImaginary();
        return new Complex(real, imaginary);
    }
}
