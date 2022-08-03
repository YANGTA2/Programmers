package edu.baekjoon.LV_13_기하1;

import java.util.Scanner;

public class LV_13_04_2477 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] coord = new int[6][2];
        
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int x = 0, y = 0;
        for(int i = 0; i < 6; i++){
            // [1]:+x [4]:+y [2]:-x [3]:-y
            int direction = sc.nextInt();
            int distance = sc.nextInt();
            if(direction == 1 || direction == 2){
                x = direction == 1 ? x + distance : x - distance;
            } else {
                y = direction == 3 ? y - distance : y + distance;    
            }
            coord[i][0] = x;
            coord[i][1] = y;
            maxX = maxX < x ? x : maxX;
            minX = minX > x ? x : minX;
            maxY = maxY < y ? y : maxY;
            minY = minY > y ? y : minY;
        }

        int midX = 0, midY = 0;
        for(int[] arr : coord){
            if(arr[0] > minX && arr[0] < maxX && arr[1] > minY && arr[1] < maxY){
                midX = arr[0];
                midY = arr[1];
            }
        }

        int midH = 0, midW = 0;
        for(int[] arr : coord){
            if(arr[0] == midX && arr[1] != midY){
                midH = Math.abs(midY - arr[1]);
            } else if(arr[0] != midX && arr[1] == midY){
                midW = Math.abs(midX - arr[0]);
            }
        }

        int maxH = Math.abs(minY) + Math.abs(maxY);
        int maxW = Math.abs(minX) + Math.abs(maxX);

        System.out.println((maxH * maxW - midH * midW) * n);
        sc.close();
    }
}
