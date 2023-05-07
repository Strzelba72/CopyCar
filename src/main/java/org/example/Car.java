package org.example;

public abstract class Car {
    public int wheels;
    public int seats;
    public Car()
    {

    }
    //copy constructor
    public Car(Car car) {
        if (car != null) {
            this.wheels = car.wheels;
            this.seats = car.wheels;
        }
    }
    public abstract Car clone();

    public abstract void display();
}
