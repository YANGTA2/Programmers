package com.SKPLANET;

import java.util.HashMap;

class Forth{
    public static void main(String[] args) {
        String[] rsp3 = { "SPR","PPR","PSS","RSS","RRR" };
        
        Forth sol = new Forth();
    
        // System.out.println(sol.solution(rsp3));
    }

    public int[] solution(String[] rsp3) {      
        int[] answer = new int [3];
        Forth sol = new Forth();

        for(int i = 0; i < rsp3.length; i++){
            if(sol.draw(rsp3[i]) == true){
                continue;
            } else {

            }
        }

        return answer;
    }

    public boolean draw(String rsp){
        boolean isDraw = false;
        
        char a = rsp.charAt(0);
        char b = rsp.charAt(1);
        char c = rsp.charAt(2);

        if((a == b && b == c) || (a != b && b != c && c != a)){
            // 3명이 모두 비겼을 때
            isDraw = true;
        } 
    
        return isDraw;
    }

    public int[] winner(String rsp){
        int[] result = new int[2];
        // [승리자, 승자 수]
        
        // 2개인 수와 1개인 수

        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < 3; i++){
            map.put(rsp.charAt(i), map.getOrDefault(rsp.charAt(i), 0)+1);
        }
        
        System.out.println(map.keySet());
        


        return result;
    }
    
}