package com.example.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        Map<String, String> users = new ConcurrentHashMap<>();
        users.put("Anna", "1234");
        users.put("Olya", "4321");

        if (users.containsKey(user) && users.get(user).equals(password)){
            authorities.add(Authorities.WRITE);
            authorities.add(Authorities.READ);
            authorities.add(Authorities.DELETE);
        } else {
            return new ArrayList<>();
        }
        return authorities;
    }
}
