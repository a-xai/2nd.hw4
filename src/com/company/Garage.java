package com.company;

import java.util.ArrayList;

public class Garage<T extends Car> implements Storable {
    private ArrayList<T> autos;


    public ArrayList<T> getAutos() {
        return autos;
    }

    public Garage(ArrayList<T> autos) {
        this.autos = autos;
    }

    @Override
    public void driveIn(Car car) {
        autos.add((T) car);
        System.out.println("_______________________");
        System.out.println(car.getClass().getSimpleName() + " " + car.getModel() + " въехал в гараж. ");
    }

    @Override
    public void driveOut(Car car) {
        if (autos.contains(car)) {
            autos.remove((T) car);
            System.out.println(car.getClass().getSimpleName() + " " + car.getModel() + " выехал из гаража. ");
            System.out.println("_______________________");


        } else {
            System.out.println("Нет такой машины в гараже.");
            System.out.println("_______________________");
        }
    }
}
