package com.BAEKJOON.RecursiveFunction;

import java.util.Scanner;

public class BAEKJOON11729 {
    
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int k = (int)Math.pow(2, n)-1;
        System.out.println(k);

        BAEKJOON11729 sol = new BAEKJOON11729();
        sol.solution(n, 1, 2, 3);
        System.out.println(sb);
    }
    
    public void solution(int n, int a, int b, int c){
        if(n > 0){
            solution(n-1, a, c, b);
            sb.append(a + " " + c + "\n");
            solution(n-1, b, a, c);
        }
    }
}
