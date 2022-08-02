package edu.baekjoon.LV_13_기하1;

import java.util.Arrays;
import java.util.Scanner;

public class LV_13_03_4153 {
    
    public static void main(String[] args) {
        
        LV_13_03_4153 sol = new LV_13_03_4153();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        while(true){
            String input = sc.nextLine();
            if(input.equals("0 0 0")){
                break;
            } else {
                String[] num = input.split(" ");
                int[] numArr = new int[3];
                
                for(int i = 0; i < 3; i++){
                    numArr[i] = Integer.parseInt(num[i]);
                }

                Arrays.sort(numArr);
                int a = numArr[0];
                int b = numArr[1];
                int c = numArr[2];
                
                if(a*a + b*b == c*c){
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
        
        sc.close();
    }
}
