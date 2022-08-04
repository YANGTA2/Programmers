package edu.baekjoon.LV_14_정수론및조합론;

import java.util.Scanner;

public class LV_14_07_11050 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(factorial(N) / (factorial(N-K) * factorial(K)));
        sc.close();
    }

    public static int factorial(int A){
        if(A == 0) return 1;
        if(A == 1) return 1;
        return factorial(A-1) * A;
    }
}
