package com.example.toshiba.interfaces;

public class GEAppliances implements SwitchBoardListener{
    @Override
    public void switchOne() {
        System.out.println("GE fan is on");
    }

    @Override
    public void switchTwo() {
        System.out.println("GE bulb is on");
    }

    @Override
    public void switchThree() {
        System.out.println("GE tubelight is on");
    }

    @Override
    public void switchFour() {
        System.out.println("GE AC is on");
    }
}
