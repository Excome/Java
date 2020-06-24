package ru.excome.toshiba;

import ru.excome.interfaces.Hand;

public class ToshibaHand implements Hand {
    @Override
    public void catchSomething() {
        System.out.println("Robot catch something");
    }
}
