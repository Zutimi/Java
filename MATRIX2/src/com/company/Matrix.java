package com.company;


import java.util.ArrayList;

public class Matrix {
    int matrix[][];
    int sizeXBase = 0;
    int sizeYBase = 0;

    public Matrix(int sizeX, int sizeY)
    {
        int max = 50;
        this.sizeXBase = sizeX;
        this.sizeYBase = sizeY;

        this.matrix = new int[sizeX][sizeY];

        for (int i = 0; i < this.sizeXBase; i++)
        {

            for (int j = 0; j < this.sizeYBase; j++)
            {
                this.matrix[i][j] = (int)(Math.random() * max);
                if (matrix[i][j] % 2 == 0)
                {
                    matrix[i][j]++;
                }
            }
        }
    }

    public void MatrixOutOnConsole()
    {
        for (int i = 0; i < this.sizeXBase; i++)
        {
            for (int j = 0; j < this.sizeYBase; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public void FindTheBiggestSumAmmongTheOddElements()
    {
        long biggestSum = 0;
        long sum = 0;
        int numberOfTheBiggestLine = 0;
        for (int i = 0; i < this.sizeXBase; i++)
        {
            for (int j = 0; j < this.sizeYBase; j++)
            {
                if (matrix[i][j] % 2 == 1){
                    sum += Math.abs(matrix[i][j]);
                }
                else
                {
                    sum = 0;
                    j = 0;
                    break;
                }
            }
            if (biggestSum < sum)
            {
                biggestSum = sum;
                numberOfTheBiggestLine = i + 1;
            }
            sum = 0;
        }
        System.out.printf("Biggest sum:= %d ", biggestSum);
        if(numberOfTheBiggestLine > 0){
            System.out.printf("Number of the biggest line := %d", numberOfTheBiggestLine);
        }else if (numberOfTheBiggestLine == 0)
        {
            System.out.printf("Can't find it");
        }

    }
}
