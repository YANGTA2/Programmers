package edu.baekjoon.LV_14_정수론및조합론;

import java.util.HashMap;
import java.util.Scanner;

public class LV_14_10_9375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = Integer.parseInt(sc.nextLine().trim());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(sc.nextLine().trim());
            map.clear();
            for(int j = 0; j < n; j++){
                String type = sc.nextLine().split(" ")[1];
                map.put(type, map.getOrDefault(type, 0)+1);
            }
            
            int result = 1;
            for(int cnt : map.values()){
                result *= cnt+1;
            }
            System.out.println(result-1);
        }
        sc.close();
    }
}
