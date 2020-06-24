package ru.smplprojects;

public class Main {

    public static void main(String[] args) {
        Seasons[] s = Seasons.values();
        for(Seasons temp : s) {
            System.out.println(temp.toString() + "\nAvg temperature: " + temp.avgTemp);
            temp.resort();
            switch(temp){
                case SUMMER:
                    System.out.println("Happy Birthday");
                    break;
                case WINTER:
                    System.out.println("New Year");
                    break;
            }
        }
    }
}
