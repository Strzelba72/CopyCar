package org.example;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Volkswagen extends Car {

    private String id = null;

    public Volkswagen() {

    }

    //copy constructor
    public Volkswagen(Volkswagen car) {
        super(car);
        this.id = car.id;


    }

    public void setId() {

        this.id = generateId();

    }

    @Override
    public Car clone() {
        return new Volkswagen(this);
    }

    //function to generate id
    public String generateId() {
        byte[] array = new byte[8];
        new Random().nextBytes(array);
        String generatedString = new String(array, StandardCharsets.UTF_8);
        return generatedString;

    }
    //display function
    @Override
    public void display() {
        System.out.println("Id :" + this.id);
    }
}
