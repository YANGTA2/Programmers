package edu.baekjoon.LV_11_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class LV_11_00_25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        int k = sc.nextInt();
        for(int i = 0; i < N; i++){
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);
        System.out.println(score[score.length - k]);
        sc.close();
    }
}
