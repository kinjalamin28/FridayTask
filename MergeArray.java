package com.FridayTask2;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[5];
        int[] b =new int[5];
        int[] res = new int[a.length + b.length];
        int p = 0;

        System.out.print("enter element for array a :");
        for (int i =0;i<a.length;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.print("Enter element for array b :");
        for (int i =0;i<b.length;i++)
        {
            b[i]=input.nextInt();
        }



        int last = Math.min(a.length, b.length);
        for (int i = 0; i != last; i++) {
            res[p++] = a[i];
            res[p++] = b[i];
        }

        int aRemain = a.length - last;
        if(aRemain > 0) {
            System.arraycopy(a, last, res, p, aRemain);
        }
        else
        {
            int bRemain = b.length - last;
            if(bRemain > 0) {
                System.arraycopy(b, last, res, p, bRemain);
            }
        }

        System.out.print("Merged Array: ");
        for (int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
