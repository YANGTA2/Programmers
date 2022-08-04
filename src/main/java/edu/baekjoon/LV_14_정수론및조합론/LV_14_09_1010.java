package edu.baekjoon.LV_14_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LV_14_09_1010 {

    static int[][] dp = new int[30][30];
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(combination(M, N) + "\n");
        }
        System.out.println(sb.toString());
    }

    public static int combination(int A, int B){
        if(A == B || B == 0) {
            return dp[A][B] = 1;
        }
        if(dp[A][B] > 0){
            return dp[A][B];
        } 
        
        return dp[A][B] = combination(A - 1, B - 1) + combination(A - 1, B);
    }
}
