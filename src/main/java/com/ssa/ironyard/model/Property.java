package com.ssa.ironyard.model;

import org.springframework.stereotype.Component;

public class Property {
    // USD
    int cost;
    String address;
    int floorArea;
public Property() {
   
}

    public Property(int cost, String address, int floorArea) {
        this.cost = cost;
        this.address = address;
        this.floorArea = floorArea;
    }

    public String getAddress() {
        return address;
    }

    public int getCost() {
        return cost;
    }

    public int getFloorArea() {
        return floorArea;
    }

}
