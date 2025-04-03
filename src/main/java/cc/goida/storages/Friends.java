package cc.goida.storages;

import cc.goida.utils.client.Imports;

import java.util.ArrayList;
import java.util.List;

public class Friends implements Imports {
    public List<Friend> friends;

    public void init(){
        friends = new ArrayList<>();
    }

    public void add(Friend friend){
        friends.add(friend);
    }

    public void remove(Friend friend){
        friends.remove(friend);
    }

    public boolean isFriend(Friend friend){
        return friends.contains(friend);
    }
}
