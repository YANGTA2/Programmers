package edu.baekjoon.LV_06_문자열;
import java.util.Scanner;

public class LV_06_07_2908 {
    
    public static void main(String[] args) {
        
        LV_06_07_2908 sol = new LV_06_07_2908();
        System.out.println(sol.solution());
    }
    
    public int solution(){
        
        Scanner sc = new Scanner(System.in);
        LV_06_07_2908 sol = new LV_06_07_2908();

        int a = Integer.parseInt(sol.reverse(sc.next()));
        int b = Integer.parseInt(sol.reverse(sc.next()));
        
        int result = (a>b) ? a : b;
        sc.close();
        return result;
    }

    public String reverse(String input){
        String result = "";
        for(int i = input.length()-1; i >= 0; i--){
            result += input.charAt(i);
        }
        return result;
    }
}
