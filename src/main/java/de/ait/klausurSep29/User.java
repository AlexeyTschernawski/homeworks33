package de.ait.klausurSep29;

import java.util.ArrayList;
import java.util.Objects;

public class User {

    private int id;
    private String name;
    private ArrayList<String> friends;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.friends = new ArrayList<String>();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<String> friends) {
        this.friends = friends;
    }

    public void  addFriend(String friend) {
        friends.add(friend);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, friends);
    }

    public String getUserName() {
        return null;
    }

    public void setUserName(String петр) {

    }

    public int getAge() {
        return 0;
    }

    public void setAge(int i) {

    }

    public void removeFriend(String саша) {

    }
}
