package com.samhudgens;

import java.util.Scanner;

/**
 * Created by samhudgens on 5/20/16.
 */
public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        int total = 0;

        int sum = 0;

        for(int i=1; i<=number; i++) {
            total += i;
        }

        System.out.println(total);
    }
}
