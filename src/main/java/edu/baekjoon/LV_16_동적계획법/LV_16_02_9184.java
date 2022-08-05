package edu.baekjoon.LV_16_동적계획법;

import java.util.Scanner;

public class LV_16_02_9184 {

    public static int[][][] dp = new int[51][51][51];
    public static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a == -1 && b == -1 && c == -1)   break;
            else {
                String temp = "w(" + a + ", " + b + ", " + c + ") = "; 
                System.out.println(temp + w(a, b, c));
            }
        }
        sc.close();
    }

    public static int w(int a, int b, int c){
        if(a <= 0 || b <= 0 || c <= 0){
            return 1;
        } 
        if(dp[a][b][c] != 0){
            return dp[a][b][c];
        }
        if(a > 20 || b > 20 || c > 20){
            return dp[20][20][20] = w(20, 20, 20);
        }
        if(a < b && b < c){
            return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        } else {
            return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        }
    }
}
