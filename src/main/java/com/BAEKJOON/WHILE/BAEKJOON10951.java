package com.BAEKJOON.WHILE;

import java.util.Scanner;

public class BAEKJOON10951 {

    public static void main(String[] args) {
        
        BAEKJOON10951 sol = new BAEKJOON10951();
        sol.solution();
        
    }

    private void solution() {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
        sc.close();
    }
}