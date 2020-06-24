package ru.excome.toshiba;

import ru.excome.interfaces.Leg;

public class ToshibaLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Robots is going");
    }
}
