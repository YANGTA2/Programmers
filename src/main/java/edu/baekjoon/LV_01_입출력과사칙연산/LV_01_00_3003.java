package edu.baekjoon.LV_01_입출력과사칙연산;

import java.util.Scanner;

public class LV_01_00_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String in = sc.nextLine();
        String[] inList = in.split(" ");
        int[] calList = {1, 1, 2, 2, 2, 8};
        for(int i = 0; i < inList.length; i++){
            sb.append(calList[i] - Integer.parseInt(inList[i]) + " ");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
