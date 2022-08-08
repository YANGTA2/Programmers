package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_05_1912_2 {

    public static Integer[] dp;
    public static int[] arr;
    public static int maxVal;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dp = new Integer[N];
        arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        dp[0] = arr[0];
        maxVal = dp[0];
        for(int i = 1; i < N; i++){
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            maxVal = Math.max(dp[i], maxVal);
        }
        System.out.println(maxVal);
        sc.close();
    }
}
