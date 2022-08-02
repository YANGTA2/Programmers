package edu.baekjoon.LV_05_함수;

import java.util.ArrayList;
import java.util.Scanner;

public class LV_05_03_1065 {

    public static void main(String[] args) {
        
        LV_05_03_1065 sol = new LV_05_03_1065();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(sol.arithmeticSequence(n));
    }
    
    public int arithmeticSequence(int n) {

        int result = 0;       
        if(n < 100){
            result = n;
        } else {
            result = 99;
            int cnt = 100;

            while(cnt <= n){
                
                String str = String.valueOf(cnt);
                ArrayList<Integer> list = new ArrayList<>();
                
                for(int i = 0; i < str.length(); i++){
                    list.add(str.charAt(i)-'0');
                }
                if((list.get(0)-list.get(1)) == (list.get(1)-list.get(2))){
                    result++;
                }
                cnt++;
            }
        }
        
        return result;
    }
}