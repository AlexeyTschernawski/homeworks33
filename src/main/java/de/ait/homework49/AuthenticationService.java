package de.ait.homework49;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthenticationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationService.class);


    private static final String USERNAME = "user123";
    private static final String PASSWORD = "pass123";

 public boolean authenticate(String username, String password){
     try {
         if (username.equals(USERNAME) && password.equals(PASSWORD)) {
             LOGGER.info("User {} was authenticated", username);
             return true;
         } else {
             throw new AuthenticationException("Wrong username/password Username: " + username);
         }
     }
     catch (AuthenticationException exception){
         LOGGER.error("Wrong username/password Username: {} {}",  username, exception.getMessage());
     }
     return false;
 }

}
