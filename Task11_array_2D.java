import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            multiArray[i] = new int [j];
        }
    }
}