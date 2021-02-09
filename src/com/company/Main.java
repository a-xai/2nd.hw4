package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes("E 220");
        Lexus lexus = new Lexus("LX 570");
        Toyota toyota = new Toyota("Camry");
        Garage garage = new Garage(new ArrayList());
        mercedes.printInfo();
        lexus.printInfo();
        toyota.printInfo();
        garage.driveIn(mercedes);
        garage.driveOut(mercedes);
        garage.driveOut(mercedes);
        garage.driveIn(lexus);
        garage.driveOut(lexus);
        garage.driveIn(toyota);
        garage.driveOut(toyota);
    }
}
