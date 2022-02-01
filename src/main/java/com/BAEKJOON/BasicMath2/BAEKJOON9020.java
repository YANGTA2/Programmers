package com.BAEKJOON.BasicMath2;

import java.util.Scanner;

public class BAEKJOON9020 {
    
    public static void main(String[] args) {
        
        BAEKJOON9020 sol = new BAEKJOON9020();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int a = n/2;
            int b = n/2;

            while(isPrime(a, b)){
                a--;
                b++;
            }
            System.out.println(a + " " + b);      
        }
        sc.close();
    }

    public boolean isPrime(int a, int b){

        boolean resultA = false;
        boolean resultB = false;
        boolean totalResult = true;

        if(Math.sqrt(a) >= 2) {
            for(int i = 2; i <= Math.sqrt(a); i++){
                if(a % i == 0){
                    // a가 소수가 아닐 때
                    resultA = true;
                    break;
                }
            }
        } else {
            resultA = false;
        }

        for(int i = 2; i <= Math.sqrt(b); i++){
            if(b % i == 0){
                // b가 소수가 아닐 때
                resultB = true;
                break;
            } 
        }

        if(!resultA && !resultB){
            totalResult = false;
        }

        return totalResult;
    }
}
