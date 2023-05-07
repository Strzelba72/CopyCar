package org.example;

public class F1 extends Car {

    private String number = null;

    public F1() {

    }

    public F1(F1 car) {
        super(car);
        this.number = car.number;


    }

    @Override
    public Car clone() {
        return new F1(this);
    }

    @Override
    public void display() {
        System.out.println("Number :"+this.number);
    }
    public void setNumber(String number)
    {
        this.number=number;
    }
}
