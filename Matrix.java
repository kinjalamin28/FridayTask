package com.company;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        int sum;
        int max =0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of matrix:");
        int r = in.nextInt();
        int c =r;
        int m[][] = new int[r][c];

        System.out.println("Enter the data :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = in.nextInt();
            }
        }
        for(int i=0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("\t" + m[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < r-2; i++) {
            for (int j = 0; j < c-2; j++) {
                    sum = (m[i][j] + m[i][j + 1] + m[i][j + 2]) + (m[i + 1][j + 1]) +
                        (m[i + 2][j] + m[i + 2][j + 1] + m[i + 2][j + 2]);
                    if (sum > max)
                        max = sum;

            }
        }

        System.out.println("max sum is "+max);
    }
}
