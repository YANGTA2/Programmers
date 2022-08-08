package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_11_2156 {

    public static Integer[] dp;
    public static int[] arr;
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new Integer[n];
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        dp[0] = arr[0];
        System.out.println(findMax(n-1));
        sc.close();
    }

    public static int findMax(int in){
        if(in < 0) return 0;
        if(in == 0){
            return dp[in];
        }
        if(dp[in] == null){
            dp[in] = Math.max(Math.max(findMax(in-3) + arr[in-1], findMax(in-2)) + arr[in], findMax(in-1));
        }
        return dp[in];
    }
}
