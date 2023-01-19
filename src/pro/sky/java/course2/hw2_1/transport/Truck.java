package pro.sky.java.course2.hw2_1.transport;

import pro.sky.java.course2.hw2_1.drivers.CatC;

public class Truck extends Transport<CatC> {

//    private TruckType truckType;

    public enum TruckType {
        N1("Грузоподъёмность до 3,5 тонн"),
        N2("Грузоподъёмность от 3,5 до 12 тонн"),
        N3("Грузоподъёмность больше 12 тонн");

        private static final float BORDER_1 = 3.5F;
        private static final float BORDER_2 = 12F;
        private final String capacity;

        TruckType(String capacity) {
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return  capacity;
        }
    }

    private TruckType trackType;

    public Truck(String brand, String model, double engineVolume, CatC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void printType() {
        if (trackType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getTrackType().toString());
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
                trackType = TruckType.N3;
            } else {
                trackType =  TruckType.N2;
            }
        } else {
            trackType =  TruckType.N1;
        }
        return null;
    }

    public TruckType getTrackType() {
        return trackType;
    }

    @Override
    public String toString() {
        return getTrackType().toString();
    }
}
