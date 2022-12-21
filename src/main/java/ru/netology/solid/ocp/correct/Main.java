package ru.netology.solid.ocp.correct;

public class Main {

    public static void main(String[] args) {
        Addition addition = new Addition();
        Division division = new Division();
        Subtraction subtraction = new Subtraction();

        Calculator calculator = new Calculator();

        calculator.calculate(addition);
        calculator.calculate(division);
        calculator.calculate(subtraction);
    }
}
