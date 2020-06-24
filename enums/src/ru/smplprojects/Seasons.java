package ru.smplprojects;

public enum Seasons {
    SPRING(12),
    SUMMER(23){
        void resort() {
            super.resort();
            System.out.println("Swim");
        }
    },
    AUTUMN(11),
    WINTER(1){
        void resort() {
            super.resort();
            System.out.println("Ski");
        }
    };
    int avgTemp;
    Seasons(int avgTemp) {
        this.avgTemp = avgTemp;
    }
    void resort() {
        System.out.println("Walk");
    }
}
