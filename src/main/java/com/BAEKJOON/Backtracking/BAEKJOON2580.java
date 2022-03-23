package com.BAEKJOON.Backtracking;

import java.util.Scanner;

public class BAEKJOON2580 {
    
    public static int[][] arr = new int[9][9];

    public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
        
        sc.close();

        BAEKJOON2580 sol = new BAEKJOON2580();
		sol.solution(0, 0);
 
	}

    public void solution(int row, int col) {
        if(col == 9){
            solution(row + 1, 0);
            return;
        }

        if(row == 9){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.print(sb);
            System.exit(0);
        }

        if(arr[row][col] == 0){
            for(int i = 1; i < 10; i++){
                if(isPossible(row, col, i)){
                    arr[row][col] = i;
                    solution(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }

        solution(row, col + 1);
    }
    
    public boolean isPossible(int row, int col, int num) {
        for(int i = 0; i < 9; i++){
            if(arr[row][i] == num){
                return false;
            }
        }

        for(int i = 0; i < 9; i++){
            if(arr[i][col] == num){
                return false;
            }
        }

        int width = (row / 3) * 3;
        int height = (col / 3) * 3;
        for(int i = width; i < width + 3; i++){
            for(int j = height; j < height + 3; j++){
                if(num == arr[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}
