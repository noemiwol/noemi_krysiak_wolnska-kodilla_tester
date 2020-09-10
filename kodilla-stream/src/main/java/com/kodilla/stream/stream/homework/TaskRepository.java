package com.kodilla.stream.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> task = new ArrayList<>();
        task.add(new Task("Wyrzucenie śmieci",LocalDate.now(),LocalDate.now().plusDays(0)));
        task.add(new Task("Zaszczepić Psa",LocalDate.now(),LocalDate.now().plusDays(7)));
        task.add(new Task("Umyć auto",LocalDate.now(),LocalDate.now().plusDays(5)));
        task.add(new Task("Napisać raport",LocalDate.now(),LocalDate.now().plusDays(10)));

        return task;

    }
}
