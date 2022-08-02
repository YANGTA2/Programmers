package edu.baekjoon.LV_08_기본수학2;

import java.util.Arrays;
import java.util.Scanner;

public class LV_08_04_1929 {
    
    public static void main(String[] args) {
        
        LV_08_04_1929 sol = new LV_08_04_1929();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] primeNum = new boolean[n+1];
        Arrays.fill(primeNum, true);

        primeNum[1] = false;
        for(int i = 2; i < primeNum.length; i++){
            if(primeNum[i] == false){
                continue;
            } else {
                for(int j = i + i; j < primeNum.length; j += i){
                    primeNum[j] = false;
                }
            }
        }
        
        for(int i = m; i <= n; i++){
            if(primeNum[i] != false){
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
