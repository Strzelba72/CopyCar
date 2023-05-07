package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Car> array = new ArrayList<>();
        List<Car> arrayCopy = new ArrayList<>();

        //create car1
        Volkswagen car1 = new Volkswagen();
        car1.seats = 5;
        car1.wheels = 4;
        car1.setId();
        array.add(car1);
        //create car2
        Volkswagen car2 = new Volkswagen();
        car2.seats = 5;
        car2.wheels = 4;
        car2.setId();
        array.add(car2);
        //create car3
        F1 car3=new F1();
        car3.seats=1;
        car3.wheels=4;
        car3.setNumber("1");
        array.add(car3);

        for (int i = 0; i < array.size(); i++) {
            System.out.println("...........................");
            //create a new object(copied) by clone function and add to copy array
            arrayCopy.add(array.get(i).clone());
            array.get(i).display();
            System.out.println(array.get(i).toString());

        }
        System.out.println("CLONE ARRAY");
        for (int i = 0; i < array.size(); i++) {
            System.out.println("...........................");
            arrayCopy.get(i).display();
            System.out.println(arrayCopy.get(i).toString());
        }


    }
}
