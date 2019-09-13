package com.cod3cat.exercises;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        this.length = length < 0 ? 0 : length;
        this.width = width < 0 ? 0 : width;
    }

    public double getArea(){
        return getLength() * getWidth();
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}