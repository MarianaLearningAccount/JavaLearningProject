package com.mariana.operationsandcyclicfunctions;

public class AritmeticOperationExample {
    public static void main(String[] args) {
        int a = 43;
        int c = 3;

        //Sum
        int sum = a + c;
        System.out.println("Suma: " + sum);
        System.out.println("Suma: " + (a +c));

        // Substraction
        int sub = a - c;
        System.out.println("Rezultatul: " + sub);

        //Multiplication
        int result = a * c;
        System.out.println("Inmultirea : " + result);

        //Division
        result = a / c;
        System.out.println("Impartirea: " + result);

        //The rest of division or division with remainder
        result = a % c;
        System.out.println("Impartirea: " + result);
    }
}
