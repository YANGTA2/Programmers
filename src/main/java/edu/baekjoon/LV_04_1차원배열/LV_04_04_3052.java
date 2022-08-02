package edu.baekjoon.LV_04_1차원배열;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LV_04_04_3052 {

    public static void main(String[] args) {
        LV_04_04_3052 sol = new LV_04_04_3052();
        sol.solution();
    }

    private void solution() {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            set.add(num%42);
        }
        
        System.out.println(set.size());
        sc.close();
    }

    /*
    private void solution() {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            int b = 42;
            int num = a % b;
            map.put(num, 1);
        }

        for(int key : map.keySet()){
            cnt += map.getOrDefault(key, 0);
        }
        
        System.out.println(cnt);

        sc.close();
    }
    */
}