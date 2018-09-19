package icu.cyclone.alex;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        System.out.println(factorial(sc.nextInt()));
    }

    public static BigInteger factorial(Integer number) {
        if (number < 0) {
            throw new IllegalArgumentException("Incorrect Input");
        }
        if(number <= 1) {
            return BigInteger.ONE;
        }
        return factorial(number - 1).multiply(new BigInteger(number.toString()));
    }
}
