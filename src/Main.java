public class Main {
    public static void main(String[] args) {
        // Создаём комплексные числа
        Complex number1 = new Complex(2, 3);
        Complex number2 = new Complex(4, 5);

        // Создаём калькулятор с операцией сложения
        ComplexCalculator calculator = new ComplexCalculator(new ComplexAddition());

        // Выполняем операцию сложения
        Complex resultAddition = calculator.calculate(number1, number2);

        // Меняем операцию на умножение
        calculator.setOperation(new ComplexMultiplication());

        // Выполняем операцию умножения
        Complex resultMultiplication = calculator.calculate(number1, number2);

        // Меняем операцию на деление
        calculator.setOperation(new ComplexDivision());

        // Выполняем операцию деления
        Complex resultDivision = calculator.calculate(number1, number2);

        // Выводим результаты
        System.out.println("Result of addition: " + resultAddition.getReal() + " + " + resultAddition.getImaginary() + "i");
        System.out.println("Result of multiplication: " + resultMultiplication.getReal() + " + " + resultMultiplication.getImaginary() + "i");
        System.out.println("Result of division: " + resultDivision.getReal() + " + " + resultDivision.getImaginary() + "i");
    }
}
