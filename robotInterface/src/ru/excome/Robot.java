package ru.excome;

import ru.excome.interfaces.Hand;
import ru.excome.interfaces.Head;
import ru.excome.interfaces.Leg;

public class Robot {
    private Head head;
    private Hand hand;
    private Leg leg;

    public Robot(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public void action() {
        this.head.think();
        this.hand.catchSomething();
        this.leg.go();
    }
}
