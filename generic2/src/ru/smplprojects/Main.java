package ru.smplprojects;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Users> usersList = new ArrayList<Users>();
        Random rnd = new Random();

        for(int i = 0; i < 40; i++) {
            String name = Data.nameList.get(rnd.nextInt(Data.nameList.size()));
            String secondName = Data.secondnameList.get(rnd.nextInt(Data.secondnameList.size()));
            int age = rnd.nextInt(20) + 18;
            usersList.add(new Users(usersList.size(), name, secondName, age));
        }

        for(Users temp : usersList) {
            System.out.println(temp + "\n");
        }
    }
}
