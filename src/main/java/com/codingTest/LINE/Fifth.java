package com.codingTest.LINE;

import java.util.ArrayList;
import java.util.Arrays;

class Fifth{

    public static void main(String[] args) {

        int[] arr = {2, 8, 3, 6, 1, 9, 1, 9};
        int k = 2;

        Arrays.sort(arr);
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int num : arr){
            arrList.add(num);
        }

        System.out.println(arrList);
        if(arrList.size() % 2 == 0){
            
        }
        
        // pick(arrList, k, 0);


    }

    public static void pick(ArrayList<Integer> arrList, int k, int result){
        if(arrList.size() == 0){
            System.out.println(result);
        } else {
            if(k > 0){
                result += arrList.get(arrList.size());
                arrList.remove(arrList.size());
                arrList.remove(arrList.size());
                pick(arrList, k-1, result);
            }
            
            arrList.remove(arrList.size());
            result += arrList.get(arrList.size());
            arrList.remove(arrList.size());
            pick(arrList, k, result);
            

        }    
    }

    public static boolean isPossible(ArrayList<Integer> arrList){

        return true;
    }
}    