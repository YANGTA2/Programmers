package edu.baekjoon.LV_07_기본수학1;

import java.util.Scanner;

public class LV_07_06_2775 {
    
    public static void main(String[] args) {
        
        LV_07_06_2775 sol = new LV_07_06_2775();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        int[][] array = new int[15][15];

        for(int i = 0; i < 15; i++){
            array[i][1] = 1;
            array[0][i] = i;
        }
        for(int i = 1; i < 15; i++){
            for(int j = 1; j < 15; j++){
                    array[i][j] = array[i-1][j] + array[i][j-1];
                }
        }

        for(int i = 0; i < t; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(array[k][n]);
        }
        
        sc.close();
    }
}
