package org.voiculescu.intersegrega.service;

import org.voiculescu.intersegrega.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Stores User entities
public class UserPersistenceService implements PersistenceService<User> {

    private static final Map<Long, User> USERS = new HashMap<>();

    @Override
    public Map<Long, User> getCache() {
        return USERS;
    }

    public List<User> findByName(String name) {
        synchronized (USERS) {
            return USERS.values().stream().filter(u -> u.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
        }
    }

}
