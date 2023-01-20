package pro.sky.java.course2.hw2_1.transport;

import pro.sky.java.course2.hw2_1.drivers.CatD;

public class Bus extends Transport <CatD> {

    public static BusType busType;




    public Bus(String brand, String model, double engineVolume, CatD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " закончил движение");
    }


    @Override
    public void printType() {
        if (busType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBusType().toString());
        }
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал движение");
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

    public BusType setBusType(int seatLimit) {
        if (seatLimit <= 10) {
            busType = BusType.VSMALL;
        } else if (seatLimit <= 25){
            busType =  BusType.SMALL;
        } else if (seatLimit <= 50) {
            busType = BusType.MIDDLE;
        } else if (seatLimit <= 80) {
            busType = BusType.BIG;
        } else if (seatLimit <= 120) {
            busType = BusType.VBIG;
        }
        return null;
    }

    public static BusType getBusType() {
        return busType;
    }

    @Override
    public String toString() {
        return getBusType().toString();
    }
}



