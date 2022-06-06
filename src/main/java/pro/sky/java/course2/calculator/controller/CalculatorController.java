package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;
import pro.sky.java.course2.calculator.service.CalculatorServiceImpl;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.sum(num1, num2);
    }

    @GetMapping("/minus")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.divide(num1, num2);
    }
}