package com.codewithmosh.implementations;

import com.codewithmosh.TravelMode;

public class DrivingMode implements TravelMode {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
