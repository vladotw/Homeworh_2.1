package pro.sky.java.course2.hw2_1.transport;

import pro.sky.java.course2.hw2_1.drivers.CatD;

public class Bus extends Transport <CatD> {


    public Bus(String brand, String model, double engineVolume, CatD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void finishMoving() {
        System.out.print("Автобус " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void startMoving() {
        System.out.print("Автобус " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void pitStop() {
        System.out.print(getBrand() + " " + getModel() + " заехал на Пит-Стоп");
    }

    @Override
    public void bestLapTime(double time) {
        System.out.println(getBrand() + " " + getModel() + " лучшее время круга: " + time +
                " с");
    }

    @Override
    public void maxSpeed(double speed) {
        System.out.println(getBrand() + " " + getModel() + " максимальная скорость " + speed +
                " км/ч");
    }
}



