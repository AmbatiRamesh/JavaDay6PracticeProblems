package com.logicalPrograms;
import java.util.Scanner;
public record ReverseNumber() {
    public static void main(String args[]) {
        int number1, number2, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        number1 = scanner.nextInt();
        while (number1 > 0) {
            number2 = number1 % 10;
            sum = sum * 10 + number2;
            number1 = number1 / 10;
        }
        System.out.println("Reverse:"+sum);
    }
}
