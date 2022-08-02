package edu.baekjoon.LV_03_반복문;

import java.util.Scanner;

public class LV_03_02_10950 {

    public static void main(String[] args) {
        
        LV_03_02_10950 sol = new LV_03_02_10950();
        sol.solution();
        
    }

    private void solution() {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i < t; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1 + num2);
        }
        sc.close();
    }
}