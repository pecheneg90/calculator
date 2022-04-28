package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String sum(int num1, int num2) {
        return String.format("%d + %d = %d", num1, num2, num1 + num2);
    }

    @Override
    public String subtract(int num1, int num2) {
        return String.format("%d - %d = %d", num1, num2, num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return String.format("%d * %d = %d", num1, num2, num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя";
        }
        return String.format("%d / %d = %d", num1, num2, num1 / num2);
    }
}