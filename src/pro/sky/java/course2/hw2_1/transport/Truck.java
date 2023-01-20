package pro.sky.java.course2.hw2_1.transport;

import pro.sky.java.course2.hw2_1.drivers.CatC;

public class Truck extends Transport<CatC> {

    private TruckType truckType;

    public Truck(String brand, String model, double engineVolume, CatC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void printType() {
        if (truckType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getTruckType().toString());
        }
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " начал движение");
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

    public TruckType setTruckType(float truckCapacity) {
        if (truckCapacity > TruckType.BORDER_1) {
            if (truckCapacity > TruckType.BORDER_2) {
                truckType = TruckType.N3;
            } else {
                truckType =  TruckType.N2;
            }
        } else {
            truckType =  TruckType.N1;
        }
        return null;
    }

    public TruckType getTruckType() {
        return truckType;
    }

    @Override
    public String toString() {
        return getTruckType().toString();
    }
}
