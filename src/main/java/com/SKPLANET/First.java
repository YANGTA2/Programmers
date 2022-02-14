package com.SKPLANET;

import java.util.Arrays;

class First{
    public static void main(String[] args) {
        int[] t = { 3, 5, 2, 9, 8 };
        int m = 3;
        
        First sol = new First();
    
        System.out.println(sol.solution(t, m));
    }

    public int solution(int[] t, int m) {
        int answer = 0;
        
        Arrays.sort(t);

        for(int i = 0; i < m; i++){
            answer += t[i]+1;
        }
        
        return answer;
    }
    
}