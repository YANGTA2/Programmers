package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_05_1912 {

    public static Integer[] dp;
    public static int[] arr;
    public static int maxVal = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N];
        dp = new Integer[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        findMax(N-1);
        System.out.println(maxVal);
        sc.close();
    }

    public static int findMax(int in){
        if(dp[in] == null){
            if(in == 0) {
                dp[0] = arr[0];
            } else {
                dp[in] = Math.max(findMax(in - 1) + arr[in], arr[in]);
            }
            maxVal = Math.max(dp[in], maxVal);
        }
        return dp[in];
    }
}
