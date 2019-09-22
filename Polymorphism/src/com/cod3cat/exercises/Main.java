package com.cod3cat.exercises;

class Car{
    private String name;
    private int wheels;
    private int cylinders;
    private boolean engine;
    private int speed;

    Car(String name, int cylinders) {
        this.name = name;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.engine = true;
        this.speed = 0;
    }

    public String startEngine(){
        this.speed = 1;
        return "Engine Started";
    }

    public String accelerate(int speed){
        this.speed += speed;
        return "Current speed: " + this.speed;
    }

    public String applyBreak(){
        this.speed = (this.speed - 5 <= 0) ? 0 : this.speed - 5;
        return "Breaks applied. Current speed: " + this.speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class Tesla extends Car{
    public Tesla(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String applyBreak(){
        int speed = (getSpeed() - 10 <= 0) ? 0 : getSpeed() - 5;
        setSpeed(speed);
        return "Breaks applied. Current speed: " + speed;
    }

    @Override
    public String startEngine(){
        setSpeed(10);
        return "Engine Started";
    }

    @Override
    public String accelerate(int speed) {
        return super.accelerate(20);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base Car", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate(10));
        System.out.println(car.getSpeed());
        System.out.println(car.applyBreak());

        Tesla tesla = new Tesla("Model Y", 4);
        System.out.println(tesla.startEngine());
        System.out.println(tesla.getSpeed());
        tesla.setSpeed(40);
        System.out.println(tesla.accelerate(40));
        System.out.println(tesla.applyBreak());

    }
}
