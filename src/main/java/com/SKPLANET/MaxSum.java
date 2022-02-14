package com.SKPLANET;

import java.util.List;
import java.util.Arrays;

public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
        // throw new UnsupportedOperationException("Waiting to be implemented.");
        int result = 0;

        // Collections.sort(list);

        // int listSize = list.size();
        // int max = list.get(listSize-1);
        // int nextMax = list.get(listSize-2);

        int max = 0;
        int nextMax = 0;
        for(Integer num : list){
            if(num > max){
                nextMax = max;
                max = num;
            } else if(num > nextMax){
                nextMax = max;
            }
        }

        result = max + nextMax;
        
        return result;
    }
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        // Should return 20, since 9 and 11 are the largest elements
        // and their sum is 20
        System.out.println(findMaxSum(list));
    }
}