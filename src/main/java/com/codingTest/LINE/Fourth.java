package com.codingTest.LINE;

class Fourth{

    public static void main(String[] args) {

        int[] arr = {3, 7, 2, 4};
        int[] brr = {4, 5, 5, 2};

        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == brr[i]){
                continue;
            } else {
                arr[i+1] += arr[i] - brr[i];
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}    