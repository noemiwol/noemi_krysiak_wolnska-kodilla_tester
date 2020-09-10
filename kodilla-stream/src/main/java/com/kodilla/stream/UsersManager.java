package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> username = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Basic"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        System.out.println(username);
    }

    public static String getUserName(User user){
        return user.getUsername();
    }
}
