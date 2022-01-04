package com.BAEKJOON.BasicMath2;

import java.util.Scanner;

public class BAEKJOON11653 {
    
    public static void main(String[] args) {
        
        BAEKJOON11653 sol = new BAEKJOON11653();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sol.factoryzation(n);
        sc.close();
    }

    public int factoryzation(int num){
        int result = 0;
        if(num != 0){
            for(int i = 2; i <= num; i++){
                if(num % i == 0){
                    result = num / i;
                    System.out.println(i);
                    break;
                }
            }
        } else {
            System.exit(0);
        }

        return factoryzation(result);
    }
}
