package ru.netology.solid.lsp;

public class ImprovedCalculator extends Calculator {

    @Override
    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            System.out.println("Cannot perform operation");
            return;
        }
        // продолжение улучшений...
    }
}
