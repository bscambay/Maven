package com.ssa.ironyard.web;

public class Vegetable {
    private final Color color;
    private final String name;

    public Vegetable(Color color, String name) {
        this.color = color;
        this.name = name;
    }
    public Color getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    
    

    public enum Color {
        RED, GREEN, YELLOW;
    }
}
