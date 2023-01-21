package pro.sky.java.course2.hw2_1.transport;

import pro.sky.java.course2.hw2_1.drivers.CatB;
import pro.sky.java.course2.hw2_1.drivers.CatC;


public class Truck extends Transport<CatC> {

    private TruckType truckType;


    public Truck(String brand,
                 String model,
                 double engineVolume,
                 CatC driver,
                 TruckType truckType)
    {
        super(brand, model, engineVolume, driver);
        this.truckType = truckType;
    }

    @Override
    public void driverLicense() throws NoDriversLicenseException {
        if (!getDriver().isDriversLicense() || getDriver().getClass() != CatC.class) {
            throw new NoDriversLicenseException("Необходимо указать тип прав!");
        } else {
            System.out.println("У водителя " + getDriver().getFio() + " права категории C.");
        }
    }

    @Override
    public void passDiagnostics(char pass) {
        super.passDiagnostics(pass);
    }


    @Override
    public void finishMoving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void printType() {
        if (truckType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            String low = truckType.getLowerBound() == null ? "" : " от " + truckType.getLowerBound();
            String upper = truckType.getUpperBound() == null ? "" : " до " +truckType.getUpperBound();
            System.out.println("Грузоподъёмность" + low + upper + " т.");
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


    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }

    public TruckType getTruckType() {
        return truckType;
    }

    @Override
    public String toString() {
        return getTruckType().toString();
    }


}
