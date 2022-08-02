package edu.baekjoon.LV_07_기본수학1;

import java.util.Scanner;

public class LV_07_01_1712 {
    
    public static void main(String[] args) {
        
        LV_07_01_1712 sol = new LV_07_01_1712();
        System.out.println(sol.solution());
    }
    
    public long solution(){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long result = 1;
        
        if(b >= c){
            result = -1;
        } else {
            result = a / (c - b)+1;
        }

        sc.close();
        return result;
    }

    /*
    public long solution(){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long result = 1;
        
        if(b >= c){
            result = -1;
        } else {
            while(a+b*result >= c*result){
                result++;
            }
        }
        
        sc.close();
        return result;
    }
    */
}
