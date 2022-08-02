package edu.baekjoon.LV_13_기하1;

import java.util.Scanner;

public class LV_13_06_1002 {
    
    public static void main(String[] args) {
        
        LV_13_06_1002 sol = new LV_13_06_1002();
        sol.solution();
        
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            
            // a^2 + b^2 = c^2
            double distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
            
            int result = 0;

            if(distance == 0 && r1 == r2){
                result = -1;
            } else if(distance > Math.abs(r1-r2) && distance < r1+r2){
                result = 2;
            } else if(r1+r2 == distance || Math.abs(r1-r2) == distance){
                result = 1;
            } else if(r1+r2 < distance || Math.abs(r1-r2) > distance || distance == 0){
                result = 0;
            } 
            System.out.println(result);
        }

        sc.close();
    }
}
