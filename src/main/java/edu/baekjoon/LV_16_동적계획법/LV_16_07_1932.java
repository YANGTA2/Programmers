package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_07_1932 {

    public static int n;
    public static int[][] arr;
    public static Integer[][] dp;
    public static int maxVal = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        dp = new Integer[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        dp[0][0] = arr[0][0];
        for(int i = 0; i < n; i++){
            findMax(n-1, i);
        }
        System.out.println(maxVal);
        sc.close();
    }

    public static int findMax(int in, int i){
        if(i < 0 || in < 0){
            return 0;
        }
        if(dp[in][i] == null){
            dp[in][i] = Math.max(findMax(in-1, i-1), findMax(in-1, i))+arr[in][i];
        }
        maxVal = Math.max(dp[in][i], maxVal);
        return dp[in][i];
    }
}