package edu.baekjoon.LV_03_반복문;

import java.util.Scanner;

public class LV_03_13_10951 {

    public static void main(String[] args) {
        
        LV_03_13_10951 sol = new LV_03_13_10951();
        sol.solution();
        
    }

    private void solution() {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
        sc.close();
    }
}