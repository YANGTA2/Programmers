package edu.baekjoon.LV_14_정수론및조합론;

import java.util.Scanner;

public class LV_14_08_11051 {

    static int[][] dp;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        dp = new int[N+1][K+1];

        System.out.println(binomial(N, K));
        sc.close();
    }

    public static int binomial(int A, int B){
        if(dp[A][B] > 0) return dp[A][B];
        if(A == B || B == 0) return dp[A][B] = 1;
        return dp[A][B] = (binomial(A-1, B-1) + binomial(A-1, B)) % 10007;
    }
}
