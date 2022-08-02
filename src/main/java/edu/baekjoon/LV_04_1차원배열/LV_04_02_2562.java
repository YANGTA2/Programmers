package edu.baekjoon.LV_04_1차원배열;
import java.util.ArrayList;
import java.util.Scanner;

public class LV_04_02_2562 {

    public static void main(String[] args) {
        LV_04_02_2562 sol = new LV_04_02_2562();
        sol.solution();
    }

    private void solution() {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 9; i++){
            int num = sc.nextInt();
            arr.add(num);

            if(num > max){
                max = num;
            }
        }
        sc.close();
        
        System.out.println(max);
        System.out.println(arr.indexOf(max)+1);
    }
}