package com.BAEKJOON.BasicMath2;

import java.util.HashMap;
import java.util.Scanner;

public class BAEKJOON3009 {
    
    public static void main(String[] args) {
        
        BAEKJOON3009 sol = new BAEKJOON3009();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> xMap = new HashMap<>();
        HashMap<Integer, Integer> yMap = new HashMap<>();

        for(int i = 0; i < 3; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            xMap.put(x, xMap.getOrDefault(x, 0)+1);
            yMap.put(y, yMap.getOrDefault(y, 0)+1);
        }

        int resultX = 0;
        int resultY = 0;

        for(Integer xNum : xMap.keySet()){
            if(xMap.get(xNum) == 1){
                resultX = xNum;
            }
        }
        for(Integer yNum : yMap.keySet()){
            if(yMap.get(yNum) == 1){
                resultY = yNum;
            }
        }

        System.out.println(resultX + " " + resultY);

        sc.close();
    }
}
