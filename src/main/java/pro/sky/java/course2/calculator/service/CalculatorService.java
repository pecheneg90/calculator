package pro.sky.java.course2.calculator.service;

public interface CalculatorService {

    String welcome();

    int sum(int num1, int num2);

    int subtract(int num1, int num2);

    int multiply(int num1, int num2);

    int divide(int num1, int num2);
}