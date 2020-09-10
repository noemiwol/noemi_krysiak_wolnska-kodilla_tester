package com.kodilla.stream.collections.adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String schoolName;
    private int numberOfStudents;
    List<Integer> students = new ArrayList<>();

    public School(String schoolName, int numberOfStudents) {
        this.schoolName = schoolName;
        this.numberOfStudents = numberOfStudents;
    }

    public School(int... students){
        for (int student: students)
            this.students.add( student );
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School)) return false;
        School school = (School) o;
        return Objects.equals( schoolName, school.schoolName ) &&
                Objects.equals( numberOfStudents, school.numberOfStudents );
    }

    @Override
    public int hashCode() {
        return Objects.hash( schoolName, numberOfStudents );
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

}
