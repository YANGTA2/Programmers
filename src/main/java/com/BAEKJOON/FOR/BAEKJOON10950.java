package com.BAEKJOON.FOR;

import java.util.Scanner;

public class BAEKJOON10950 {

    public static void main(String[] args) {
        
        BAEKJOON10950 sol = new BAEKJOON10950();
        sol.solution();
        
    }

    private void solution() {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i < t; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1 + num2);
        }
        sc.close();
    }
}