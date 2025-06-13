package com.codewithmosh;

import com.codewithmosh.implementations.DrivingMode;
import com.codewithmosh.implementations.WalkingMode;

public class Main {
    public static void main(String[] args) {
        var directionService = new DirectionService();
        directionService.setTravelMode(new DrivingMode());
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());

        directionService.setTravelMode(new WalkingMode());
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());
    }
}