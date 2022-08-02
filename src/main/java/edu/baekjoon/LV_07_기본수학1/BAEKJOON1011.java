package edu.baekjoon.LV_07_기본수학1;

import java.util.Scanner;

public class BAEKJOON1011 {
    
    public static void main(String[] args) {
        
        BAEKJOON1011 sol = new BAEKJOON1011();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int distance = y - x;
            Double validate = Math.sqrt((double)distance);

            int result = 0;
            if(validate % 1 == 0){
                result = (int)(validate * 2 - 1);
            } else {
                Double temp = Math.ceil(validate);
                if(distance > Math.pow(temp, 2) - temp){
                    result = (int)(temp * 2 - 1);
                } else {
                    result = (int)(temp * 2 - 2);
                }
            }
            System.out.println(result);
        }

        sc.close();
    }
}
