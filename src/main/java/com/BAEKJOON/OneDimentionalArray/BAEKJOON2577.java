package com.BAEKJOON.OneDimentionalArray;

import java.util.HashMap;
import java.util.Scanner;

public class BAEKJOON2577 {

    public static void main(String[] args) {
        BAEKJOON2577 sol = new BAEKJOON2577();
        sol.solution();
    }

    private void solution() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a * b * c;
        String str = String.valueOf(result);

        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println(str);
        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i)-'0';
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);

        for(int i = 0; i < 10; i++){
            System.out.println(map.getOrDefault(i, 0));
        }

        sc.close();
    }

    /*
    private void solution() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a * b * c;
        String str = String.valueOf(result);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 10; i++){
            map.put(i, 0);
        }

        System.out.println(str);
        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i)-'0';
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);

        for(int i = 0; i < 10; i++){
            System.out.println(map.get(i));
        }

        sc.close();
    }
    */
}