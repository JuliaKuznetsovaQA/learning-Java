package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0)
        return "";
        String hex = "";
        while (decimalNumber != 0) {
            int x = decimalNumber % 16;
            hex = HEX.substring(x, x+1) + hex;
            decimalNumber = decimalNumber / 16;
        }
        return hex;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == "" || hexNumber == null)
        return 0;
        int dec = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            String s = hexNumber.substring(i, i+1);
            int h = 0;
            for (int j = 0; j < HEX.length(); j++) {
                String m = HEX.substring(j, j+1);
                if (m.equals(s))
                    h = j;

            }
            dec = 16 * dec + h;
        }
        return dec;
    }
}
