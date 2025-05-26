package com.codewithmosh.implementations;

import com.codewithmosh.TravelMode;

public class TransitMode implements TravelMode {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
