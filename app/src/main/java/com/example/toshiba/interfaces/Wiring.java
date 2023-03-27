package com.example.toshiba.interfaces;

public class Wiring {

    public static void main(String[] args) {
        SwitchBoardListener sbl = new HavellsAppliances();
                //new GEAppliances();

        sbl.switchOne();
        sbl.switchTwo();
        sbl.switchThree();
        sbl.switchFour();
    }

}
