package ru.smplprojects;
import java.util.*;

public class Data {
    static List<String> nameList = new ArrayList<String>();
    static List<String> secondnameList = new ArrayList<String>();
    static {
        String [] nameData = {"Maksim", "Egor", "Andray", "Aleksander", "Petr"};
        String[] secondnameData = {"Titov", "Peshekhonov", "Strodji", "Tikhonov", "Zyablikov"};
        for(String temp : nameData) {
            nameList.add(temp);
        }
        for(String temp : secondnameData) {
            secondnameList.add(temp);
        }
        System.out.println(nameList);
    }
}