package edu.baekjoon.LV_03_반복문;

import java.util.Scanner;

public class LV_03_12_10952 {

    public static void main(String[] args) {
        
        LV_03_12_10952 sol = new LV_03_12_10952();
        sol.solution();
        
    }

    private void solution() {

        Scanner sc = new Scanner(System.in);

        boolean result = true;

        while(result){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a+b == 0) {
                result = false;
            } else {
                System.out.println(a + b);
            }
        }
        sc.close();
    }
}