package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String word;

        System.out.printf("Input your string =:");

        for(;;) {
            word = in.next();
            System.out.printf("%s ", new StringBuffer(word).reverse().toString());

            if (word.equals("0")){
                break;
            }
        }
    }
}
