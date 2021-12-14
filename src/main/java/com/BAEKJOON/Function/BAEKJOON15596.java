package com.BAEKJOON.Function;

public class BAEKJOON15596 {

    public long sum(int[] a) {

        long ans = 0;

        for(int num : a){
            ans += num;
        }

        return ans;
    }
}