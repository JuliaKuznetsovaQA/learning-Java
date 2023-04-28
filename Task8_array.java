package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        strings = new String[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            strings[i] = sc.nextLine();
        }
        for (int i = 0; i < 6; i++) {
           String word = strings[i];
           for (int x = 0; x < strings.length; x++) {
               if (i != x && word != null) {
                   if (word.equals(strings[x])) {
                   strings[i] = null;
                   strings[x] = null;
               }
             }
           }
        }
        
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
