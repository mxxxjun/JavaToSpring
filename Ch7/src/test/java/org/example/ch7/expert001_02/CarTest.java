package org.example.ch7.expert001_02;

import org.example.ch7.export001_02.AmericaTire;
import org.example.ch7.export001_02.Car;
import org.example.ch7.export001_02.KoreaTire;
import org.example.ch7.export001_02.Tire;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void 자동차_코리아타이어_장착_타이어브랜드_테스트(){
        Tire tire1 = new KoreaTire();
        Car car = new Car(tire1);

        assertEquals("장착된 타이어: 코리아 타이어", car.getTireBrand());
    }

    @Test
    public void 자동차_미국타이어_장착_타이어브랜드_테스트(){
        Tire tire1 = new AmericaTire();
        Car car = new Car(tire1);

        assertEquals("장착된 타이어: 미국 타이어", car.getTireBrand());
    }
}
