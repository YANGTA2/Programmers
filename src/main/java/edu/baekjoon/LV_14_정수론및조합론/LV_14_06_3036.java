package edu.baekjoon.LV_14_정수론및조합론;

import java.util.Scanner;

public class LV_14_06_3036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int standard = arr[0];
        for(int i = 1; i < N; i++){
            int res = getGCD(standard, arr[i]);
            sb.append((standard/res) + "/" + (arr[i]/res) + "\n");
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
