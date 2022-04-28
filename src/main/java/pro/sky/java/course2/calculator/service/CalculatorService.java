package pro.sky.java.course2.calculator.service;

public interface CalculatorService {

    String welcome();

    String sum(int num1, int num2);

    String subtract(int num1, int num2);

    String multiply(int num1, int num2);

    String divide(int num1, int num2);
}