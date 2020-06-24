package ru.smplprojects;

import java.util.GregorianCalendar;

public class Users {
    int id;
    String name;
    String secondName;
    int age;

    public Users(int id, String name, String secondName, int age) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    static <Users> void test() {

    }

    public String toString() {
        return "id: " + this.id + "\nName: " + this.name + "\nSecondname: " + this.secondName + "\nAge: " + this.age;
    }

}
