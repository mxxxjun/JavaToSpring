package org.example.ch7.export001_02;

public class Driver {
    public static void main(String[] args){
        Tire tire = new AmericaTire();
        Car car = new Car(tire);

        System.out.println(car.getTireBrand());
    }
}
