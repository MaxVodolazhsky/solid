package ru.netology.solid.lsp;

public class Demo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        ImprovedCalculator improvedCalculator = new ImprovedCalculator();

        Executor executor = new Executor();

        executor.execute(improvedCalculator, null);
        executor.execute(calculator, null);
    }
}
