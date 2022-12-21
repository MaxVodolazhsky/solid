package ru.netology.solid.magicdigit;

import java.util.ArrayList;
import java.util.List;

public class Test {

    private static final double TAX_SALARY = 0.13;

    public static void main(String[] args) {

        int salary = 20000;

        List<String> statuses = new ArrayList<>();

        for (String status: statuses) {
            if (status.equals("AB23")) {
                System.out.println("Message!");
            }
        }
    }
}
