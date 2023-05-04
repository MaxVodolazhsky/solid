package ru.netology.solid.ocp.correct;

public class Main {

    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.setLeft(10);
        addition.setRight(20);
//        Division division = new Division();
//        Subtraction subtraction = new Subtraction();

        Calculator calculator = new Calculator();

        calculator.calculate(addition);
        System.out.println(addition.getResult());
//        calculator.calculate(division);
//        calculator.calculate(subtraction);
    }
}
