package de.ait.klausurSep29;

import java.util.ArrayList;

public class Realisation {
    public static void main(String[] args) {

        SocialNetwork socialNetwork = new SocialNetwork();

        // Register users
        User user1 = socialNetwork.registerUser(1, "Alice");
        User user2 = socialNetwork.registerUser(2, "Bob");
        User user3 = socialNetwork.registerUser(3, "Charlie");

        // Adding friends
        user1.addFriend(String.valueOf(user2));
        user1.addFriend(String.valueOf(user3));

        // Create groups
        Group group1 = socialNetwork.createGroup(101, "Java Enthusiasts");
        Group group2 = socialNetwork.createGroup(102, "Art Lovers");

        // Adding members to groups
        group1.addMember(user1);
        group1.addMember(user2);
        group2.addMember(user3);

        // Create posts
        socialNetwork.createPost(user1, "Hello, World!");
        socialNetwork.createPost(user2, "Check out this artwork!");
        socialNetwork.createPost(user3, "Excited about Java!");


        // Getting user groups
        ArrayList<Group> groupsOfUser1 = socialNetwork.getUserGroups(user1);
        System.out.println("Groups of Alice:");
        for (Group group : groupsOfUser1) {
            System.out.println(group.getName());
        }

    }
}


