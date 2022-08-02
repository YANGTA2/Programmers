package edu.baekjoon.LV_07_기본수학1;

import java.math.BigInteger;
import java.util.Scanner;

public class LV_07_08_10757 {
    
    public static void main(String[] args) {
        
        LV_07_08_10757 sol = new LV_07_08_10757();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        sc.close();

        System.out.println(a.add(b));
    }
}
