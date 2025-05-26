package com.codewithmosh;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DirectionService {
    private TravelMode travelMode;

    public Object getEta() {
        return travelMode.getETA();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }
}
