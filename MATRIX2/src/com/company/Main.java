package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner in = new Scanner(System.in);

        System.out.printf("Input X size:= ");
        a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.printf("Input Y size:= ");
        b = in2.nextInt();

        Matrix God = new Matrix(a, b);

        God.MatrixOutOnConsole();
        God.FindTheBiggestSumAmmongTheOddElements();

    }
}
