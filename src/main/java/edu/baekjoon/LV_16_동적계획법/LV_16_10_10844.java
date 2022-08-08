package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_10_10844 {

    public static Long[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dp = new Long[N+1][10];
        for(int i = 0; i < 10; i++){
            dp[1][i] = 1L;
        }
        long res = 0;
        for(int i = 1; i < 10; i++){
            res += findTotal(N, i);
        }
        System.out.println(res % 1000000000);
        sc.close();
    }

    public static long findTotal(int depth, int num){
        if(depth == 1){
            return dp[1][num];
        }
        if(dp[depth][num] == null){
            if(num == 0){
                dp[depth][num] = findTotal(depth - 1, num + 1);
            } else if(num == 9){
                dp[depth][num] = findTotal(depth - 1, num - 1);
            } else {
                dp[depth][num] = findTotal(depth - 1, num - 1) + findTotal(depth - 1, num + 1);
            }
        }
        return dp[depth][num] % 1000000000;
    }
}
