package com.BAEKJOON.String;

import java.util.HashMap;
import java.util.Scanner;

public class BAEKJOON1316 {
    
    public static void main(String[] args) {
        
        BAEKJOON1316 sol = new BAEKJOON1316();
        System.out.println(sol.solution());
    }
    
    public int solution(){

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int result = 0;
        
        for(int a = 0; a < n; a++){
            int cnt = 0;
            String word = sc.nextLine();
            HashMap<String, Integer> map = new HashMap<>();
            
            for(int i = 0; i < word.length(); i++){

                String now = String.valueOf(word.charAt(i));
                
                if(i != word.length()-1){
                    String next = String.valueOf(word.charAt(i+1));
                    if(!now.equals(next)){
                        map.put(now, map.getOrDefault(now, 0)+1);
                        cnt++;
                    }
                } else {
                    map.put(now, map.getOrDefault(now, 0)+1);
                    cnt++;
                }
                if(map.size() != cnt){
                    break;
                };
            }
            if(map.size() == cnt){
                result++;
            };
        }
        sc.close();
        return result;
    }
}
