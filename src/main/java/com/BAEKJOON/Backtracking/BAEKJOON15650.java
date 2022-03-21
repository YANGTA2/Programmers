package com.BAEKJOON.Backtracking;

import java.util.Scanner;

public class BAEKJOON15650 {
    
    public static int[] arr;
    public static int n, m;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
    
        sc.close();
        
        arr = new int[m];
        
        BAEKJOON15650 sol = new BAEKJOON15650();
        sol.solution(1, 0);
        
    }
    
    public void solution(int startNum, int depth){
        if(depth == m){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for(int i = startNum; i <= n; i++){
            arr[depth] = i;
            solution(i + 1, depth + 1);
        }
    }
}
