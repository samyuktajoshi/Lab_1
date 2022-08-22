package com.company;
import java.util.Scanner;

import static java.lang.Integer.sum;

public class Program {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b = scan.nextInt();
        System.out.println("Enter fird number: ");
        int c = scan.nextInt();
        int sum = a+b+c;
        System.out.println("Sum of numbers is "+sum);
    }
}
