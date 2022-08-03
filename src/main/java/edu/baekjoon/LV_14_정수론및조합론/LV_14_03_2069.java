package edu.baekjoon.LV_14_정수론및조합론;

import java.util.Scanner;

public class LV_14_03_2069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int GCD = getGCD(A, B);
        System.out.println(GCD);
        System.out.println(A * B / GCD);
        sc.close();
    }

    public static int getGCD(int A, int B){
        if(B == 0) {
            return A;
        }
        return getGCD(B, A % B);
    }
}
