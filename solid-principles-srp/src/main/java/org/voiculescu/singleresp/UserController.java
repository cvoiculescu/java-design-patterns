package org.voiculescu.singleresp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    //Store used by controller
    private final Store store = new Store();
    private final UserValidator validator = new UserValidator();

    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(userJson, User.class);

        if (!validator.validateUser(user)) {
            return "ERROR";
        }

        store.store(user);

        return "SUCCESS";
    }

}