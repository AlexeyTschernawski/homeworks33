package de.ait.klausurSep29;

import java.util.ArrayList;
import java.util.HashMap;

public class SocialNetwork {

    private HashMap<Integer, User> users;
    private HashMap<Integer, Group> groups;
    private ArrayList<Post> posts;

    public SocialNetwork() {
        this.users = new HashMap<>();
        this.groups = new HashMap<>();
        this.posts = new ArrayList<>();
    }

    public User registerUser(int id, String name) {
        User user = new User(id, name);
        users.put(id, user);
        return user;
    }

    public Group createGroup(int id, String name) {
        Group group = new Group(id, name);
        groups.put(id, group);
        return group;
    }

    public void createPost(User author, String content) {
        int postId = posts.size(); // Assuming post IDs are sequential.
        Post post = new Post(postId, content, author);
        posts.add(post);
    }

    public ArrayList<String> getFriends(User user) {
        return user.getFriends();
    }

    public ArrayList<Group> getUserGroups(User user) {
        ArrayList<Group> userGroups = new ArrayList<>();
        for (Group group : groups.values()) {
            if (group.getMembers().contains(user)) {
                userGroups.add(group);
            }
        }
        return userGroups;
    }
}

