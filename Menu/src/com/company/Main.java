package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numberForChoose = 0;
        int numberToFactorial;
        String subString;
        String mainString;
        do{
            System.out.println("Press 1 to calculate factorial");
            System.out.println("Press 2 to reverse your string");
            System.out.println("Press 3 to check if there is a substring");
            System.out.println("Press 0 to exit");
            System.out.println("==> ");

            numberForChoose = in.nextInt();

            switch (numberForChoose)
            {
                case 1:

                    System.out.println("Input your number");
                    numberToFactorial = in.nextInt();
                    long factorial;

                    for (int i = 1; i <= numberToFactorial; i++)
                    {
                        factorial *= i;
                    }

                    System.out.printf("Factorial = %d", factorial);
                    break;

                case 2:
                    System.out.println("Input string to reverse");
                    mainString = in.nextLine();
                    String b = new StringBuffer(mainString).reverse().toString();
                    System.out.println(b);
                    break;

                case 3:
                    System.out.println("Input string main string");
                    mainString = in.nextLine();
                    System.out.println("Input substring");
                    subString = in.nextLine();
                    boolean isContain = mainString.contains(subString);

                    if (isContain){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                    break;
            }
        }while (numberForChoose != 0);
    }
}
