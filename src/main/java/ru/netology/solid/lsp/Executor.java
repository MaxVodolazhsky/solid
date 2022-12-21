package ru.netology.solid.lsp;

public class Executor {

    public void execute(Calculator calculator, CalculatorOperation operation) {
        calculator.calculate(operation);
    }
}
