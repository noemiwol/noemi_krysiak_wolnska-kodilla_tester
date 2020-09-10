package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kajetan", new Teacher("Jan Kowalaski")));
        students.add(new Student("Maja ",new Teacher("Dawid Wolański")));
        students.add(new Student("Jola",null));
        students.add(new Student("Marta", null));



        for (Student student: students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.teacher);
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Uczeń: " + student.name + " Nauczyciel: " + teacherName);

        }
    }
}
