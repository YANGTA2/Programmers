package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_03_1904 {

    public static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        dp = new int[1000001];
        dp[0] = 0; dp[1] = 1; dp[2] = 2;
        for(int i = 3; i <= N; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }

        System.out.println(dp[N]);
        System.out.println(tile(N));
        sc.close();
    }

    public static int tile(int in){
        if(in == 1) return dp[in] = 1;
        if(in == 2) return dp[in] = 2;
        return dp[in] = (dp[in-1] + dp[in-2]) % 15746;
    }
}
