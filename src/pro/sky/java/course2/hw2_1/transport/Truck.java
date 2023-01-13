package pro.sky.java.course2.hw2_1.transport;

import pro.sky.java.course2.hw2_1.drivers.CatC;

public class Truck extends Transport <CatC>{

    public Truck(String brand, String model, double engineVolume, CatC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void finishMoving() {
        System.out.print("Грузовик " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void startMoving() {
        System.out.print("Грузовик " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void pitStop() {

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
