package edu.programmers.sort;

import java.util.Arrays;

class SortLevel1{
    public static void main(String[] args) {
        int[] array = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = {{ 2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        
        SortLevel1 sol = new SortLevel1();
    
        System.out.println(Arrays.toString(sol.solution(array, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0];
            int cnt = commands[i][1];
            int[] temp = new int[cnt-start+1];            
            
            for(int j = 0; j < cnt-start+1; j++){
                temp[j] = array[j+start-1];   
            }
            
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        
        return answer;
    }
    
}