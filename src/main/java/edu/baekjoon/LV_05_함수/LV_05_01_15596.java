package edu.baekjoon.LV_05_함수;
public class LV_05_01_15596 {

    public long sum(int[] a) {

        long ans = 0;

        for(int num : a){
            ans += num;
        }

        return ans;
    }
}