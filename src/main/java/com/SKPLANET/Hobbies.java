package com.SKPLANET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Hobbies {
    
    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();
    
    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }
    
    public List<String> findAllHobbyists(String hobby) {

        ArrayList<String> result = new ArrayList<>();

        for(String hob : hobbies.keySet()){
            String[] search = hobbies.get(hob);
            for(int i=0; i < search.length; i++){
                if(hobby.equals(search[i])){
                    result.add(hob);
                }
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        Hobbies hobbies = new Hobbies();
        hobbies.add("Steve", "Fashion", "Piano", "Reading");
        hobbies.add("Patty", "Drama", "Magic", "Pets");
        hobbies.add("Chad", "Puzzles", "Pets", "Yoga");

        System.out.println(Arrays.toString(hobbies.findAllHobbyists("Yoga").toArray()));
    }
}
