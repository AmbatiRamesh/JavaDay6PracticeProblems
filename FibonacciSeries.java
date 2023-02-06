package com.logicalPrograms;
import java.util.Scanner;
public class FibonacciSeries {
        public static void main(String[] args) {
            int number, a = 0, b = 0, c = 1;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value of n:");
            number = scanner.nextInt();
            System.out.print("Fibonacci Series:");
            for(int i = 1; i <= number; i++)
            {
                a = b;
                b = c;
                c = a + b;
                System.out.print(a+" ");
            }
        }
}

