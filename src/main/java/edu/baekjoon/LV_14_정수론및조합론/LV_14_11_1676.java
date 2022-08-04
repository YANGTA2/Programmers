package edu.baekjoon.LV_14_정수론및조합론;

import java.util.Scanner;

public class LV_14_11_1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        while(N >= 5){
            N /= 5;
            cnt += N;
        }
        System.out.println(cnt);
        sc.close();
    }
}
