package edu.baekjoon.LV_04_1차원배열;

import java.util.Scanner;

public class LV_04_01_10818 {

    public static void main(String[] args) {
        LV_04_01_10818 sol = new LV_04_01_10818();
        sol.solution();
    }

    private void solution() {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        int max = -1000001;
        int min = 1000001;

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num > max){
                max = num;
            } 
            if(num < min) {
                min = num;
            }
        }
        System.out.println(min + " " + max);
        sc.close();
    }

    /* -- 시간초과 --
    private void solution() {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> numList = new ArrayList<>();
        
        String arr = sc.nextLine();
        for(int i = 0; i < n; i++){
            numList.add(Integer.parseInt(arr.split(" ")[i]));
        }

        int max = -1000000;
        int min = 1000000;

        for(int i = 0; i < numList.size(); i++){
            if(numList.get(i) > max){
                max = numList.get(i);
            }
            if(numList.get(i) < min){
                min = numList.get(i);
            }
        }
        System.out.println(min + " " + max);
        sc.close();
    }
    */
}