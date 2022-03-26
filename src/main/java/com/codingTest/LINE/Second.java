package com.codingTest.LINE;

import java.util.HashMap;
import java.util.HashSet;

class Second{
    
    public static HashMap<String, Integer> score = new HashMap<>();
    public static HashSet<String> needKey = new HashSet<>();
    public static void main(String[] args) {

        /*
            ["line in line", "LINE", "in lion"]	  5 	20
            ["ABcD", "bdbc", "a", "Line neWs"]	  7 	12
        */

        String[] sentences = {"line in line", "LINE", "in lion"};
        for(int i = 0; i < sentences.length; i++){
            score.put(sentences[i], sentences[i].length());
        }

        for(String str : sentences){
            for(int i = 0; i < str.length(); i++){
                needKey.add(String.valueOf(str.charAt(i)).toLowerCase());
            }
        }
        needKey.remove(" ");
        System.out.println(needKey);

        // set 을 주고 해당하는 set으로 문자 만들 수 있는지 여부

    }


}    