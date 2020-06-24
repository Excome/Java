package ru.excome;

import ru.excome.sony.SonyHand;
import ru.excome.sony.SonyHead;
import ru.excome.toshiba.ToshibaLeg;

public class RobotConstructor {

    public static void main(String[] args) {
        SonyHead sonyHead = new SonyHead();
        SonyHand sonyHand = new SonyHand();
        ToshibaLeg toshibaLeg = new ToshibaLeg();

        Robot robot1 = new Robot(sonyHead, sonyHand, toshibaLeg);
        robot1.action();
    }
}
