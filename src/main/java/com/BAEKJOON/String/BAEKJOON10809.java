package com.BAEKJOON.String;

import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON10809 {
    
    public static void main(String[] args) {
        
        BAEKJOON10809 sol = new BAEKJOON10809();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int[] resultCnt = new int[26];

        Arrays.fill(resultCnt, -1);

        for(int i = str.length()-1; i >= 0; i--){
            int col = str.charAt(i)-'a';
            resultCnt[col] = i;
        }

        for (int i : resultCnt) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    /*
    public String solution(){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int[] resultCnt = new int[26];

        for(int i = 0; i < resultCnt.length; i++){
            resultCnt[i] = -1;
        }

        for(int i = str.length()-1; i >= 0; i--){
            int col = str.charAt(i)-'a';
            resultCnt[col] = i;
        }

        String result = "";
        for (int i : resultCnt) {
            result += i + " ";
        }

        sc.close();

        return result;
    }
    */
}
