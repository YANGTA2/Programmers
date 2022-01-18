package com.BAEKJOON.BasicMath2;

import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON4948 {
    
    public static void main(String[] args) {
        
        BAEKJOON4948 sol = new BAEKJOON4948();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        int validate = 1;
        while(validate != 0){
            int n = sc.nextInt();
            if(n == 0){
                validate = 0;
            } else {
                int cnt = 0;
                
                boolean[] primeNum = new boolean[(2*n)+1];
                Arrays.fill(primeNum, true);
        
                primeNum[0] = primeNum[1] = false;
                for(int i = 2; i < primeNum.length; i++){
                    if(primeNum[i] == false){
                        continue;
                    } else {
                        for(int j = i + i; j < primeNum.length; j += i){
                            primeNum[j] = false;
                        }
                    }
                }
        
                for(int i = n+1; i < 2*n+1; i++){
                    if(primeNum[i] == true){
                        cnt++;
                    }
                }
                System.out.println(cnt);
            }
        }

        sc.close();
    }
}
