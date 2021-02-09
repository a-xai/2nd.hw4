package com.company;

public interface Storable<T extends Car> {
    void driveIn(T car);
    void driveOut(T car);

}
