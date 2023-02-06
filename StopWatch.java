package com.logicalPrograms;
import java.util.Scanner;
public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long start,end;
        double time;
        System.out.println("Enter any character to start the stopwatch");
        char startTime=scanner.next().charAt(0);
        start=System.currentTimeMillis();
        System.out.println("Enter any character to stop the stopwatch");
        char endTime=scanner.next().charAt(0);
        end=System.currentTimeMillis();
        time=(end-start)/1000.0;
        System.out.println(time);
    }
}

