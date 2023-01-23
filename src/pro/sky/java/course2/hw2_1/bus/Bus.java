package pro.sky.java.course2.hw2_1.bus;

import pro.sky.java.course2.hw2_1.drivers.CatD;
import pro.sky.java.course2.hw2_1.drivers.NoDriversLicenseException;
import pro.sky.java.course2.hw2_1.mechanic.Mechanic;
import pro.sky.java.course2.hw2_1.transport.Transport;

public class Bus extends Transport<CatD> {

    private static BusType busType;




    public Bus(String brand,
               String model,
               double engineVolume,
               CatD driver,
               Mechanic mechanic,
               BusType busType
    ) {
        super(brand, model, engineVolume, driver, mechanic);
        this.busType = busType;
    }

    public static BusType getBusType() {
        return busType;
    }

    public void setBusType(BusType busType) {
        this.busType = busType;
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
            System.out.println("Вместимость автобуса от " + busType.getMinCapacity() + " до " +
                    busType.getMaxCapacity() + " чел.");
        }
    }

    @Override
    public void driverLicense() throws NoDriversLicenseException {
        if (!getDriver().isDriversLicense()) {
            throw new NoDriversLicenseException("Необходимо указать тип прав!");
        } else {
            System.out.println("У водителя " + getDriver().getFio() + " права категории D.");
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

    @Override
    public String toString() {
        return getBusType().toString();
    }
}



