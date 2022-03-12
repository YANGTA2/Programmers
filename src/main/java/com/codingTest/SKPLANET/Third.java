package com.codingTest.SKPLANET;

import java.util.HashMap;

class Third{
    public static void main(String[] args) {
        String[] color = { "BW", "RY", "BY" };
        int[] prices = { 9000, 10000 };
        
        Third sol = new Third();
    
        System.out.println(sol.solution(color, prices));
    }

    public int solution(String[] color, int[] prices) {
        int answer = 0;

        HashMap<Character, Integer> topMap = new HashMap<>();
        HashMap<Character, Integer> bottomMap = new HashMap<>();

        for(int i = 0; i < color.length; i++){
            char top = color[i].charAt(0);
            char bottom = color[i].charAt(1);

            topMap.put(top, topMap.getOrDefault(top, 0)+1);
            bottomMap.put(bottom, bottomMap.getOrDefault(bottom, 0)+1);
        }

        char[] colors = {'B', 'W', 'R', 'Y', 'G'};
        
        int pair = 0;
        int notPair = 0;
        
        for(int i = 0; i < colors.length; i++){
            int topCnt = topMap.getOrDefault(colors[i], 0);
            int bottomCnt = bottomMap.getOrDefault(colors[i], 0);

            if(topCnt == bottomCnt){
                pair += topCnt;
            } else if(topCnt != 0 && bottomCnt != 0) {
                pair += Math.min(topCnt, bottomCnt);
                notPair += Math.abs(topCnt - bottomCnt);
            } else {
                notPair += topCnt + bottomCnt;
            }
        }   

        System.out.println(topMap);
        System.out.println(bottomMap);

        System.out.println(pair);
        System.out.println(notPair);
        
        answer = Math.min(pair*prices[0] + notPair*prices[0], pair*prices[0] + notPair/2*prices[1]);

        return answer;
    }
    
}