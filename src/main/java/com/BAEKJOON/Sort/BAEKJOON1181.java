package com.BAEKJOON.Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BAEKJOON1181 {

    public static void main(String[] args) throws Exception {
        
        BAEKJOON1181 sol = new BAEKJOON1181();
        sol.solution();
        
    }

    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLine();
        }
        
        sc.close();

        Arrays.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });
        
        System.out.println(arr[0]);
        for(int i = 1; i < n; i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }

    /*
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            if(!list.contains(str)){
                list.add(str);
            }
        }
        
        sc.close();

        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for(String str : list){
            System.out.println(str);
        }
    }
    */
}
