package edu.baekjoon.LV_12_집합과맵;

import java.util.HashMap;
import java.util.Scanner;

public class LV_12_06_1269 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A + B; i++){
            int input = sc.nextInt();
            map.put(input, map.getOrDefault(input, 0)+1);
        }

        int cnt = 0;
        for(Integer key : map.keySet()){
            if(map.get(key) == 1){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
