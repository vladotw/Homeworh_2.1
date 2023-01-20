package pro.sky.java.course2.hw2_1.drivers;

import pro.sky.java.course2.hw2_1.transport.Transport;

public class CatD extends Driver {

    public CatD(String fio, boolean driversLicense, int drivingExp) {
        super(fio, driversLicense, drivingExp);
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель автобуса " + getFio() + " производит заправку.");
    }

    @Override
    public void beginMovie() {
        System.out.println("Водитель автобуса " + getFio() + " начал движение.");

    }

    @Override
    public void endMovie() {
        System.out.println("Водитель автобуса " + getFio() + " закончил движение.");
    }


}
