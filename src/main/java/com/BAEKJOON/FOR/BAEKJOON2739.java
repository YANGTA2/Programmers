package com.BAEKJOON.FOR;

import java.util.Scanner;

public class BAEKJOON2739 {

    public static void main(String[] args) {
        
        BAEKJOON2739 sol = new BAEKJOON2739();
        sol.solution();
        
    }

    private void solution() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i < 10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
        sc.close();
    }
}