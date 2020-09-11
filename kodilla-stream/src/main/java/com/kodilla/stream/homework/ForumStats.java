package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class ForumStats {
    public static void main(String[] args) {

      /*Napisz Stream tak, aby obliczył średnią liczbę postów dla użytkowników,
    których wiek jest >= 40.

    Napisz kolejny Stream, który obliczy średnią liczbę postów dla użytkowników,
    których wiek jest < 40.*/

        double averagePost = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40 )
                .map(User::getNumberOfPosts)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(averagePost);

        double averagePost2 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40 )
                .map(User::getNumberOfPosts)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(averagePost2);

    }
}
