package de.ait.klausurSep29;

import java.util.HashSet;

public class Group {

    private int id;
    private String name;
    private HashSet <User> members;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
        this.members = new HashSet<>();
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

    public HashSet<User> getMembers() {
        return members;
    }

    public void setMembers(HashSet<User> members) {
        this.members = members;
    }

    public void  addMember(User user) {
        members.add(user);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Group group = (Group) obj;
        return id == group.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

