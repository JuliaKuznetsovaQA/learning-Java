package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i <10; i++) {
            for (int n = 0; n < 10; j++) {
            MULTIPLICATION_TABLE[i][n] = (i+1)*(n+1);
            System.out.print(MULTIPLICATION_TABLE[i][n]+" ");
    }
    System.out.println();
}

        
    }
}
