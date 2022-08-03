package edu.baekjoon.LV_14_정수론및조합론;

import java.util.Scanner;

public class LV_14_02_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < N; i++){
            int in = sc.nextInt();
            min = min > in ? in : min;
            max = max < in ? in : max;   
        }
        
        System.out.println(min * max);
        sc.close();
    }
}
