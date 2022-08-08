package edu.baekjoon.LV_03_반복문;

import java.util.Scanner;

public class LV_03_00_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
        }
        String result = X == sum ? "Yes" : "No";
        System.out.println(result);
        sc.close();
    }
}
