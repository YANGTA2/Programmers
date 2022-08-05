package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_04_9461 {

    public static long[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            dp = new long[N+1];
            System.out.println(P(N));
        }
        sc.close();
    }

    public static long P(int N){
        if(dp[N] > 0) return dp[N];
        if(N == 0) return dp[N] = 0;
        if(N == 1) return dp[N] = 1;
        if(N == 2) return dp[N] = 1;
        return dp[N] = P(N-2) + P(N-3);
    }
}
