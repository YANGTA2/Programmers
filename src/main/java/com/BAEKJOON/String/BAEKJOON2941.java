package com.BAEKJOON.String;

import java.util.Scanner;

public class BAEKJOON2941 {
    
    public static void main(String[] args) {
        
        BAEKJOON2941 sol = new BAEKJOON2941();
        System.out.println(sol.solution());
    }
    
    public int solution(){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
 
        String[] removeWord = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i = 0; i < removeWord.length; i++){
            str = str.replaceAll(removeWord[i], "_");
        }
        
        int result = str.length();

        sc.close();
        return result;
    }
}
