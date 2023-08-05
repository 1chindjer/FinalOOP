public class ComplexDivision implements ComplexOperation {
    @Override
    public Complex perform(Complex number1, Complex number2) {
        double real = (number1.getReal() * number2.getReal() + number1.getImaginary() * number2.getImaginary()) /
                (Math.pow(number2.getReal(), 2) + Math.pow(number2.getImaginary(), 2));

        double imaginary = (number2.getReal() * number1.getImaginary() - number1.getReal() * number2.getImaginary()) /
                (Math.pow(number2.getReal(), 2) + Math.pow(number2.getImaginary(), 2));

        return new Complex(real, imaginary);
    }
}
