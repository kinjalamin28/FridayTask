package com.FridayTask2;

import java.util.Scanner;

public class AlphabetOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {

            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print(s.charAt(i)+""
                    +count);
        }


    }
}
