package edu.baekjoon.LV_14_정수론및조합론;

import java.util.Scanner;

public class LV_14_04_1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int result = 0;
            if(A == 1 || B == 1){
                result = A == 1 ? B : A;
            } else {
                result = A * B / getGCD(A, B);
            }
            sb.append(result + "\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    public static int getGCD(int A, int B){
        if(B == 0) {
            return A;
        }
        return getGCD(B, A % B);
    }
}
