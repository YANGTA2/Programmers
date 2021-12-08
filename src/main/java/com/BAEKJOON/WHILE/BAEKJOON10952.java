package com.BAEKJOON.WHILE;

import java.util.Scanner;

public class BAEKJOON10952 {

    public static void main(String[] args) {
        
        BAEKJOON10952 sol = new BAEKJOON10952();
        sol.solution();
        
    }

    private void solution() {

        Scanner sc = new Scanner(System.in);

        boolean result = true;

        while(result){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a+b == 0) {
                result = false;
            } else {
                System.out.println(a + b);
            }
        }
        sc.close();
    }
}