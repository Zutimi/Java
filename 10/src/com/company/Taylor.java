package com.company;

public class Taylor
{
    public static double calculate (int k, double x){
        int step = 1;
        double resultOfStep = 0.0;
        double result = 0.0;
        do {
            result += resultOfStep;
            resultOfStep = taylorPart(step, x);
            step++;
        }while (Math.abs(resultOfStep) > Math.pow (10, -k));
        return result;
    }

    private static double taylorPart(int step, double x){
        return (Math.pow (-1, step + 1) * Math.pow(x, (step * 2) - 1)) / ((step * 2) - 1);
    }
}
