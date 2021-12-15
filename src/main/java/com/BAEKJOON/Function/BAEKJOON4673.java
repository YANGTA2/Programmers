package com.BAEKJOON.Function;

import java.util.ArrayList;
import java.util.HashMap;

public class BAEKJOON4673 {

    public static void main(String[] args) {
        
        BAEKJOON4673 sol = new BAEKJOON4673();
       
        int cnt = 1;

        HashMap<Integer, Integer> map = new HashMap<>();

        while(cnt < 10001){
            map.put(sol.nonSelfNum(cnt), 1);
            cnt++;
        }

        for(int i = 1; i < 10001; i++){
            if(map.getOrDefault(i, 0) != 1){
                System.out.println(i);
            }
        }
    }
    
    public int nonSelfNum(int n) {

        int result = n;

        String num = String.valueOf(n);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < num.length(); i++){
            list.add((num.charAt(i) - '0'));
        }
        for (int slice : list) {
            result += slice;
        }
        return result;
    }
    
    
    /*  : 더 느리게 작동
    public int nonSelfNum(int n) {
        int result = n;

        while(n != 0){
            result += n % 10;
            n /= 10;
        }

        return result;
    }
    */
}