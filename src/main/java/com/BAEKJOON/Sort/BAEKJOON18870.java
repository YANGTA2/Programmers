package com.BAEKJOON.Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BAEKJOON18870 {

    public static void main(String[] args) throws Exception {
        
        BAEKJOON18870 sol = new BAEKJOON18870();
        sol.solution();
        
    }

    
    public void solution() throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] inputArr = new int[n];
        int[] sortedArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            inputArr[i] = Integer.parseInt(st.nextToken());
            sortedArr[i] = inputArr[i];
        }
        
        Arrays.sort(sortedArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for(int i = 0; i < n; i++){
            if(!map.containsKey(sortedArr[i])){
                map.put(sortedArr[i], rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int num : inputArr){
            sb.append(map.get(num)).append(" ");
        }
        
        System.out.println(sb);
    }

    /*  --! 시간 초과
    public void solution() throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        
        HashSet<Integer> set = new HashSet<>();

        String[] inputStr = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            input[i] = Integer.parseInt(inputStr[i]);
            set.add(input[i]);
        }

        ArrayList<Integer> arr = new ArrayList<>(set);
        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();

        for(int num : input){
            sb.append(arr.indexOf(num)).append(" ");
            // System.out.println(arr.indexOf(num));
        }
        
        System.out.println(sb);
    }
    */
}
