package com.codingTest.SKPLANET;

class Second{
    public static void main(String[] args) {
        int[] deposit = { 500, 1000, -300, 200, -400, 100, -100 };
        
        Second sol = new Second();
    
        System.out.println(sol.solution(deposit));
    }

    public int[] solution(int[] deposit) {      
        int[] result = new int[1000];
        int cnt = 0;

        int temp = 0;
        
        for(int i = 0; i < deposit.length; i++){
            int nowNum = deposit[i];         
            if(i == 0){
                result[cnt] = nowNum;
                continue;
            }
            
            if(nowNum > 0){
                cnt++;
                temp = nowNum;
                result[cnt] = nowNum;
            } else if(nowNum < 0 && temp + nowNum < 0){
                result[cnt] = 0;
                cnt--;
                result[cnt] += temp + nowNum;
            } else if(nowNum < 0 && temp + nowNum == 0){
                result[cnt] = 0;
                cnt--;
            } else if(nowNum < 0){
                temp += nowNum;
                result[cnt] = temp;
            }
        }
        
        int[] answer = new int[cnt+1];

        for(int i = 0; i < cnt+1; i++){
            answer[i] = result[i];
        }

        return answer;
    }
    
}