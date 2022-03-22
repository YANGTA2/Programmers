package com.BAEKJOON.Backtracking;

import java.util.Scanner;

public class BAEKJOON15652 {
    
    public static int[] arr;
    public static int n, m;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
    
        sc.close();
        
        arr = new int[m];
        
        BAEKJOON15652 sol = new BAEKJOON15652();
        sol.solution(1, 0);

        System.out.println(sb);
        
    }
    
    public void solution(int start, int depth){
        if(depth == m){
            for(int num : arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i < n+1; i++){
            arr[depth] = i;
            solution(i, depth + 1);
        }
    }
}