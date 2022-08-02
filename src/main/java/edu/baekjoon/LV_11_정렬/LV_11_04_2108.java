package edu.baekjoon.LV_11_정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LV_11_04_2108 {

    public static void main(String[] args) throws Exception {
        
        LV_11_04_2108 sol = new LV_11_04_2108();
        sol.solution();
        
    }

    public void solution() throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];

        int sum = 0;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num + 4000]++;
            sum += num;

            maxNum = num > maxNum ? num : maxNum;
            minNum = num < minNum ? num : minNum;
        }
        
        int check = 0;
        int mid = 0;
        int maxCnt = 0;
        int frequentNum = 0;

        boolean validate = false;

        for(int i = 0; i < 8001; i++){
            if(check < (n + 1) / 2 ){
                check += arr[i];
                mid = i - 4000;
            }

            if(maxCnt < arr[i]){
                maxCnt = arr[i];
                frequentNum = i - 4000;
                validate = true;
            } else if (maxCnt == arr[i] && validate == true) {
                frequentNum = i - 4000;
                validate = false;
            }


        }
        
        System.out.println(Math.round((double)sum/n));
        System.out.println(mid);
        System.out.println(frequentNum);
        System.out.println(maxNum - minNum);

        /*
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){

            if(maxCnt < arr[i]){
                maxCnt = arr[i];
            }

            for(int j = 0; j < arr[i]; j++){
                list.add(i - 4000);
            }
        }

        System.out.println(Math.round(sum/n));
        System.out.println(list.get((int)Math.floor(list.size()/2)));
        System.out.println(list.get(list.size()-1)-list.get(0));        
        */
    }
}
