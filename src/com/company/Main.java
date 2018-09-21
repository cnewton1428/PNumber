package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner prime = new Scanner(System.in);
        int Num = 0;

        System.out.println("Enter any number");
        Num = prime.nextInt();
        System.out.println();

        int sqrt = (int) Math.sqrt(Num) + 1;
        for (
                int i = 2;
                i < sqrt; i++)


            if (Num % i == 0) {
                System.out.println(Num + " is not a prime number");
            } else {
                System.out.println(Num + " is a prime number");
            }


        {
            System.out.print("The Starting number 1");
            int start = prime.nextInt();
            System.out.print("The ending number" + Num);
            int end = prime.nextInt();
            System.out.println("Generate prime numbers between" + start + "and" + end);
            for (int j = start; j <= end; j++)
                if (isPrime(j))
                    System.out.print(j);
        }
    }


            public static boolean isPrime ( int n){
            if (n <= 1) {
                return false;
            }
            for (int j = 2; j <= Math.sqrt(n); j++) ;
            if (n % j == 0) {
                return false;
            }

            return true;
        }

        }




