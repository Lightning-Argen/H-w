package com.company;

public class Person {
    private String name;
    private String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    void Learn() {
        System.out.println("Can learn");
    }

    void Walk() {
        System.out.println("He walk");
    }

    void Eat() {
        System.out.println("eat");
    }

    @Override
    public String toString() {
        return "Person name-" + name + "  designation-" + designation;
    }
}