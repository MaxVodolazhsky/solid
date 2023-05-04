package ru.netology.solid.magicdigit;

import java.util.ArrayList;
import java.util.List;

public class Test {

    private static final double TAX_SALARY = 0.13;

    private static final String SOME_PARAMETER = "AB23";

    public static void main(String[] args) {

        double salary = 20000;

        salary = salary * TAX_SALARY;

        List<String> statuses = new ArrayList<>();

        for (String status: statuses) {
            if (status.equals(SOME_PARAMETER)) {
                System.out.println("Message!");
            }
        }
    }
}
