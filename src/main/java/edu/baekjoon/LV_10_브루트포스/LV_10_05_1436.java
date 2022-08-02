package edu.baekjoon.LV_10_브루트포스;

import java.util.Scanner;

public class LV_10_05_1436 {

    public static void main(String[] args) {
        
        LV_10_05_1436 sol = new LV_10_05_1436();
        System.out.println(sol.solution());
        
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int startNum = 666;
        int cnt = 1;

        sc.close();

        while(cnt != n){
            startNum++;
            
            if(String.valueOf(startNum).contains("666")){
                cnt++;
            }
        }
        
        return startNum;
    }
}
