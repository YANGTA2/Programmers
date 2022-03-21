package com.BAEKJOON.Backtracking;

import java.util.Scanner;

public class BAEKJOON15651 {
    
    public static int[] arr;
    public static int n, m;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
    
        sc.close();
        
        arr = new int[m];
        
        BAEKJOON15651 sol = new BAEKJOON15651();
        sol.solution(0);

        System.out.println(sb);
        
    }
    
    public void solution(int depth){
        if(depth == m){
            for(int num : arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < n; i++){
            arr[depth] = i + 1;
            solution(depth + 1);
        }
    }
}
