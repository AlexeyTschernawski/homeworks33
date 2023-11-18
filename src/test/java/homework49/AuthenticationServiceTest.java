package homework49;

import de.ait.homework49.AuthenticationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AuthenticationServiceTest {

    private AuthenticationService authenticationService;

    @BeforeEach
    void setUp() {
        authenticationService = new AuthenticationService();
    }

    @Test
    void  testAuthenticateWithCorrectCredentials() {
        assertTrue(authenticationService.authenticate("user123", "pass123"),
                "Authentication should succeed with correct credentials");
    }

    @Test
    void testAuthenticateWithIncorrectUsername() {
        assertFalse(authenticationService.authenticate("wrongUser", "pass123"),
                "Authentication should fail with incorrect username");
    }

    @Test
    void testAuthenticateWithIncorrectPassword() {
        assertFalse(authenticationService.authenticate("user123", "wrongPass"),
                "Authentication should fail with incorrect password");
    }

    @Test
    void testAuthenticateWithIncorrectUsernameAndPassword() {
        assertFalse(authenticationService.authenticate("wrongUser", "wrongPass"),
                "Authentication should fail with incorrect username and password");
    }

}