package com.logicalPrograms;
import java.util.Scanner;
public class PrimeNumber {
        public static void main(String args[])
        {
            int j, number, sum = 0;
            System.out.print("Enter the number :");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            for( j = 2; j < number; j++)
            {
                if(number % j == 0)
                {
                    sum = 0;
                    break;
                }
                else
                {
                    sum = 1;
                }
            }
            if(sum == 1)
            {
                System.out.println(""+number+" is a prime number.");
            }
            else
            {
                System.out.println(""+number+" is not a prime number.");
            }
        }
}


