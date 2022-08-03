package edu.baekjoon.LV_13_기하1;

import java.util.Scanner;

public class LV_13_07_1004 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++){
            int startX = sc.nextInt();
            int startY = sc.nextInt();
            int endX = sc.nextInt();
            int endY = sc.nextInt();
            
            int testCase = sc.nextInt();
            int resCnt = 0;
            for(int j = 0; j < testCase; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int r = sc.nextInt();

                boolean start, end;
                start = Math.pow(startX - x, 2) + Math.pow(startY - y, 2) < Math.pow(r, 2)
                    ? true : false;
                end = Math.pow(endX - x, 2) + Math.pow(endY - y, 2) < Math.pow(r, 2)
                    ? true : false;

                if(!((start && end) || (!start && !end))){
                    resCnt++;
                }
            }
            sb.append(resCnt + "\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
