package edu.baekjoon.LV_09_재귀;

import java.util.Arrays;
import java.util.Scanner;

public class LV_09_04_2447 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        LV_09_04_2447 sol = new LV_09_04_2447();
        
        String[][] arr = new String[n][n];
        
        for(int i = 0; i < arr.length; i++){
            Arrays.fill(arr[i], " ");
        }

        sol.solution(arr, n, 0, 0);
        for(int i = 0; i < arr.length; i++){
            String result = "";
            for(int j = 0; j < arr[i].length; j++){
                result += arr[i][j];
            }
            System.out.println(result);
        }

    }
    
    public void solution(String[][] arr, int n, int x, int y){        
        if(n == 1){
            arr[x][y] = "*";
            return;
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i != 1 || j != 1){
                    solution(arr, n / 3, x + i * (n / 3), y + j * (n / 3));
                }
            }
        }
    }
}
