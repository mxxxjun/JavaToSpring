package org.example.ch7.export001_01;

import org.example.ch7.export001_01.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {
    @Test
    public void 자동차_장착_타이어브랜드_테스트(){
        Car car = new Car();


        assertEquals("장착된 타이어: 코리아 타이어", car.getTireBrand());
    }
}
