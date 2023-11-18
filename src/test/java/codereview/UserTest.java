package codereview;

import de.ait.klausurSep29.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User(30, "Ivan");
    }

    @Test
    void testGetUserName() {
        assertEquals("Ivan", user.getUserName());
    }

    @Test
    void testsetUserName() {
        user.setUserName("Peter");
        assertEquals("Peter", user.getUserName());
    }

    @Test
    void testGetAge() {
        assertEquals(30, user.getAge());
    }

    @Test
    void testSetAge() {
        user.setAge(20);
        assertEquals(20, user.getAge());
    }

    @Test
    void testAddFriend() {
        user.addFriend("Maria");
        user.addFriend("Olga");
        List<String> expectedFriends = new ArrayList<>();
        expectedFriends.add("Maria");
        expectedFriends.add("Olga");
        assertEquals(expectedFriends, user.getFriends());
    }

    @Test
    void testRemoveFriend() {
        user.addFriend("Sasha");
        user.addFriend("Maria");
        user.removeFriend("Sasha");
        ArrayList<String> expectedFriends = new ArrayList<>();
        expectedFriends.add("Maria");
        assertEquals(expectedFriends, user.getFriends());
    }

}