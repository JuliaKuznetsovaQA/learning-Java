package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0) 
        return 0;
        int i = 0;
        int x = 00;
        while (decimalNumber != 0) {
            x = x + (decimalNumber % 8) * (int) Math.pow (10, i);
            decimalNumber = decimalNumber / 8;
            i = i + 1;
        }
        return x;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0) 
        return 0;
        int i = 0;
        int y = 0;
        while (octalNumber != 0) {
            y = y + (octalNumber % 10) * (int) Math.pow (8, i);
            octalNumber = octalNumber / 10;
            i = i + 1;
        }
        return y;
    }
}
