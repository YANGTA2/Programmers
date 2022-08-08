package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_04_9461_2 {

    public static long[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        dp = new long[101];
        dp[2] = dp[1] = dp[0] = 1;
        for(int j = 3; j < 101; j++){
            dp[j] = dp[j-2] + dp[j-3];
        }
        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            System.out.println(dp[N-1]);
        }
        sc.close();
    }
}
