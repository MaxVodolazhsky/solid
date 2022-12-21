package ru.netology.solid.dry;

public class Main {

    public static void main(String[] args) {
        int a = 4;
        int b = 2;

        check(a);
        check(a);

    }

    private static void check(int a) {
        if(a > 1) {
            System.out.println("Message");
        }
    }
}
