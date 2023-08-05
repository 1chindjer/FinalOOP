public class ComplexAddition implements ComplexOperation {
    @Override
    public Complex perform(Complex number1, Complex number2) {
        return new Complex(number1.getReal() + number2.getReal(),
                number1.getImaginary() + number2.getImaginary());
    }
}
