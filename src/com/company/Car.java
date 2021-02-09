package com.company;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printInfo(){
        System.out.println(getClass().getSimpleName() + " " + model);
        System.out.println("_______________________");
    }
}
