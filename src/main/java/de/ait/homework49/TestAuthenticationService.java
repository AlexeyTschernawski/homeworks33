package de.ait.homework49;

public class TestAuthenticationService {

    private static AuthenticationService authenticationService;

    public static void main(String[] args) {
        authenticationService = new AuthenticationService();
        boolean result = authenticationService.authenticate("user123", "pass123");
        System.out.println(result);
    }
}
