package com.PROGRAMMERS.hash;
import java.util.HashMap;

class HashLevel1{
    public static void main(String[] args) {
        String[] part = { "mislav", "stanko", "mislav", "ana" };
        String[] comp = { "stanko", "ana", "mislav" };
        
        HashLevel1 sol = new HashLevel1();
    
        System.out.println(sol.solution(part, comp));
    }

    /*  -- 시간초과 --
        
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        List<String> partList = new ArrayList<String>(Arrays.asList(participant));
        for(int i = 0; i < completion.length; i++){
            partList.remove(completion[i]);
        }
        answer = partList.get(0);
        return answer;
    }
    */

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hMap = new HashMap<>();
        for(String partList : participant){
            hMap.put(partList, hMap.getOrDefault(partList, 0)+1);
        }
        for(String compList : completion){
            hMap.replace(compList, hMap.get(compList)-1);
        }
        for(String name : hMap.keySet()){
            if(hMap.get(name) == 1){
                answer = name;
                break;
            }
        }
        return answer;
    }
    
}