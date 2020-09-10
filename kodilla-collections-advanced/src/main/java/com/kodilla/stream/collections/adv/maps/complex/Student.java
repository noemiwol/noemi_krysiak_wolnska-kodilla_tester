package com.kodilla.stream.collections.adv.maps.complex;

import java.util.Objects;

public class Student {
    private String firstname;
    private String lastname;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals( firstname, student.firstname ) &&
                Objects.equals( lastname, student.lastname );
    }

    @Override
    public int hashCode() {
        return Objects.hash( firstname, lastname );
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }



    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }



    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
