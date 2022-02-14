package com.SKPLANET;

import java.util.ArrayList;
import java.util.Collection;

public class Friend {
    private Collection<Friend> friends;
    private String email;
    private boolean result = false;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend friend) {
        // throw new UnsupportedOperationException("Waiting to be implemented.");

        // System.out.println(this.getEmail());
        // System.out.println(this.getFriends().equals(friend));
        if(result == true){
            return true;
        }
        if(this.getFriends().equals(friend)){
            // a가 c와 친구면 종료
            result = true;
            return true;
        } else {
            // a가 c와 친구가 아니면,
            // a의 친구들(b)을 다시 탐색.

            for(Friend f : this.getFriends()){ // b 등등 ..
                for(Friend n : f.getFriends()){ // b 의 친구 n 이 friend 와 같으면.
                    if(n.equals(friend)){
                        result = true;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(c));
    }
}