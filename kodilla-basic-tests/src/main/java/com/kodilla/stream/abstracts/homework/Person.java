package com.kodilla.stream.abstracts.homework;

public class Person {
    private String firstName;
    private int age;

    private Job job;

    public Person(String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void getWorkResponsibilites(){
        System.out.println(job.getResponsibilities());
    }



    public static void main(String[] args) {

        Person warehouseman = new Person( "Stefan",40 ,new Warehouseman ());
        warehouseman.getWorkResponsibilites();

        Person housekeeper = new Person("Jadwiga",58,new Housekeeper());
        housekeeper.getWorkResponsibilites();



    }


}
