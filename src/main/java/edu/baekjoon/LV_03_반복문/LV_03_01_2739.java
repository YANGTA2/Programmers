package edu.baekjoon.LV_03_반복문;

import java.util.Scanner;

public class LV_03_01_2739 {

    public static void main(String[] args) {
        
        LV_03_01_2739 sol = new LV_03_01_2739();
        sol.solution();
        
    }

    private void solution() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i < 10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
        sc.close();
    }
}