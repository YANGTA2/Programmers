package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_08_2579 {

    public static int N;
    public static int[] arr;
    public static Integer[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        dp = new Integer[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        System.out.println(findMax(N-1));
        sc.close();
    }

    public static int findMax(int in){
        if(in < 0) return 0;
        if(dp[in] == null){
            dp[in] = Math.max(findMax(in-2), findMax(in-3) + arr[in-1]) + arr[in];
        }
        return dp[in];
    }
}
