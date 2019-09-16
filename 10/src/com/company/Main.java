package com.company;

import java.util.Scanner;


public class Main{
    public static void main(String[] args)
    {
        int k;
        double x;

        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Input k: ");
            k = in.nextInt();
            System.out.println("Input x: ");
            x = in.nextDouble();
            if (x > 1 || x < -1){
                System.out.println("Error in Inputing");
                return;
            }
            System.out.printf("%.3f %.3f", Taylor.calculate(k, x), Math.atan(x));
        }catch (Throwable ex){
            System.out.println("Error occurred while reading input!");
        }
    }
}
