package com.company;
import java.util.Scanner;

import static java.lang.Integer.sum;

public class Program {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("¬ведите первое число: ");
        int a = scan.nextInt();
        System.out.println("¬ведите второе число: ");
        int b = scan.nextInt();
        System.out.println("¬ведите третье число: : ");
        int c = scan.nextInt();
        int sum = a+b+c;
        System.out.println("—умма чисел равна = "+sum);
    }
}
