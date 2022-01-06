package com.PROGRAMMERS.stackAndQue;

import java.util.Arrays;

class StackAndQueLevel1{
    public static void main(String[] args) {
        int[] array = { 93, 30, 55 };
        int[] speeds = { 1, 30, 5 };
        
        StackAndQueLevel1 sol = new StackAndQueLevel1();
    
        System.out.println(Arrays.toString(sol.solution(array, speeds)));
    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[100];
        
        int day = -1;
        
        for(int i = 0; i < progresses.length; i++){
            while(progresses[i] + (speeds[i] * day) < 100){
                day++;
            }
            temp[day]++;
        }
        int cnt = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] != 0){
                cnt++;
            }
        }

        int size = 0;
        int[] answer = new int[cnt];
        for(int i = 0; i < temp.length; i++){
            if(temp[i] != 0){
                answer[size] = temp[i];
                size++;
            }
        }
        
        return answer;
    }
}