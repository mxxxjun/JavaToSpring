package org.example.ch7.export004;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

    @Autowired
    Tire tire;

    public Tire getTire(){
        return tire;
    }

    public String getTireBrand(){
        return "장착된 타이어: " + tire.getBrand();
    }
}
