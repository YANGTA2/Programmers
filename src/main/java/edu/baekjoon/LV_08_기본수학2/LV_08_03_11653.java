package edu.baekjoon.LV_08_기본수학2;

import java.util.Scanner;

public class LV_08_03_11653 {
    
    public static void main(String[] args) {
        
        LV_08_03_11653 sol = new LV_08_03_11653();
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
