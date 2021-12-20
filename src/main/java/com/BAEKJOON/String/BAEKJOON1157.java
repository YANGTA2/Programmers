package com.BAEKJOON.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class BAEKJOON1157 {
    
    public static void main(String[] args) {
        
        BAEKJOON1157 sol = new BAEKJOON1157();
        System.out.println(sol.solution());
    }
    
    public String solution(){
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();
        String result = "";
        
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < word.length(); i++){
            String chr = String.valueOf(word.charAt(i));
            map.put(chr, map.getOrDefault(chr, 0)+1);
        }

        int maxValue = Collections.max(map.values());
        ArrayList<String> list = new ArrayList<>();

        for(String str : map.keySet()){
            if(map.get(str) == maxValue){
                list.add(str);
            }
        }

        if(list.size() == 1){
            result = list.get(0);
        } else {
            result = "?";
        }

        sc.close();
        return result;
    }
}
