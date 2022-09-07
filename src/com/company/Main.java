package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int num1 = in.nextInt();

        System.out.print("Введіть друге число: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 +" = " + (num1+num2));
        System.out.println(num1 + " - " + num2 +"= " + (num1-num2));
        System.out.println(num1 + " / " + num2 +" = " + (num1/num2));
        System.out.println(num1 + " * " + num2 +" = " + (num1*num2));
        System.out.println(num1 + " % " + num2 +" = " + (num1%num2));
    }
}
