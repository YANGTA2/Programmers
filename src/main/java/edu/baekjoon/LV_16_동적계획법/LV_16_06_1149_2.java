package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_06_1149_2 {

    public static int n;
    public static int[][] arr, dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = arr = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
                if(i == 0){
                    dp[i][j] = arr[i][j];
                }
            }
        }

        for(int i = 1; i < n; i++){
            for(int j = 0; j < 3; j++){
                if(j == 0){
                    dp[i][j] = Math.min(dp[i-1][1], dp[i-1][2]) + arr[i][j];
                } else if(j == 1){
                    dp[i][j] = Math.min(dp[i-1][0], dp[i-1][2]) + arr[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i-1][0], dp[i-1][1]) + arr[i][j];
                }
            }
        }
        int min = Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]);
        System.out.println(min);
        sc.close();
    }
}
