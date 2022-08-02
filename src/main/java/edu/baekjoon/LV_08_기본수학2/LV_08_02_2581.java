package edu.baekjoon.LV_08_기본수학2;

import java.util.ArrayList;
import java.util.Scanner;

public class LV_08_02_2581 {
    
    public static void main(String[] args) {
        
        LV_08_02_2581 sol = new LV_08_02_2581();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = m; i <= n; i++){
            boolean isPrime = true;
            if(i == 1){
                isPrime = false;
            } else {
                for(int j = 2; j <= Math.sqrt(i); j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                list.add(i);
            }
        }
        
        if(list.size() == 0){
            System.out.println(-1);
        } else {
            int sum = 0;
            for(Integer primeNum : list){
                sum += primeNum;
            }
            System.out.println(sum);
            System.out.println(list.get(0));
        }

        sc.close();
    }
}
