package edu.baekjoon.LV_07_기본수학1;

import java.util.Scanner;

public class LV_07_07_2839 {
    
    public static void main(String[] args) {
        
        LV_07_07_2839 sol = new LV_07_07_2839();
        System.out.println(sol.solution());
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = -1;
        
        if(n == 4 || n == 7){
            result = -1;
        } else if(n % 5 == 0){
            result = n / 5;
        } else if(n % 5 == 1 || n % 5 == 3){
            result = n / 5 + 1; 
        } else if(n % 5 == 2 || n % 5 == 4){
            result = n / 5 + 2;
        }
        sc.close();

        return result;
    }
}
