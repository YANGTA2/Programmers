package edu.baekjoon.LV_12_집합과맵;

import java.util.HashSet;
import java.util.Scanner;

public class LV_12_07_11478 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String input = sc.nextLine();
        
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < input.length(); i++){
            for(int j = i; j < input.length(); j++){
                set.add(input.substring(i, j+1));
            }
        }
        System.out.println(set.size());
        sc.close();
    }
}
