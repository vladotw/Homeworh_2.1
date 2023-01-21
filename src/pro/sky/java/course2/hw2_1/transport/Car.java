package pro.sky.java.course2.hw2_1.transport;

import pro.sky.java.course2.hw2_1.drivers.CatB;
import pro.sky.java.course2.hw2_1.drivers.CatC;

import java.util.Arrays;

public class Car extends Transport<CatB> {

    //    private double engineVolume;
//    private String transmission;
    public static CarType carType;

    //    private String regNumber;
//    private final int numberOfSeats;
//    private boolean summerTyre;
//    private Key key;

    private static final String DEFAULT_VALUE = "Default";
    //    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final String DEFAULT_TRANSMISSION = "manual";
    private static final String DEFAULT_BODY_TYPE = "sedan";
//    private static final int DEFAULT_NUMBEROFSEATS = 5;

    public Car(String brand,
               String model,
               double engineVolume,
               CatB driver,
               CarType carType) {
        super(brand, model, engineVolume, driver);
        this.carType = carType;

    }

//        setEngineVolume(engineVolume);
//        setTransmission(transmission);
//        setRegNumber(regNumber);
//        setSummerTyre(summerTyre);
//        setKey(remoteStart, entryWithoutKey);

//        if (numberOfSeats <= 0) {
//            this.numberOfSeats = DEFAULT_NUMBEROFSEATS;
//        } else {
//            this.numberOfSeats = numberOfSeats;
//        }
//
//        if (bodyType == null || bodyType.isBlank()) {
//            this.bodyType = DEFAULT_BODY_TYPE;
//        } else {
//            this.bodyType = bodyType;
//        }


//    class Key {
//        private final boolean remoteStart;
//        private final boolean entryWithoutKey;
//
//        public Key(boolean remoteStart, boolean entryWithoutKey) {
//            this.remoteStart = remoteStart;
//            this.entryWithoutKey = entryWithoutKey;
//        }
//
//        public boolean getRemoteStart() {
//            return remoteStart;
//        }
//
//        public boolean getEntryWithoutKey() {
//            return entryWithoutKey;
//        }
//
//        @Override
//        public String toString() {
//            return "Key{" +
//                    "remoteStart=" + remoteStart +
//                    ", entryWithoutKey=" + entryWithoutKey +
//                    '}';
//        }
//    }

//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        if (engineVolume <= 0) {
//            this.engineVolume = DEFAULT_ENGINE_VOLUME;
//        } else {
//            this.engineVolume = engineVolume;
//        }
//    }

//    public String getTransmission() {
//        return transmission;
//    }
//
//    public String getRegNumber() {
//        return regNumber;
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//    public boolean getSummerTyre() {
//        return summerTyre;
//    }
//
//    public void setTransmission(String transmission) {
//        if (transmission == null || transmission.isBlank()) {
//            this.transmission = DEFAULT_TRANSMISSION;
//        } else {
//            this.transmission = transmission;
//        }
//    }
//
//    public void setRegNumber(String regNumber) {
//        if (regNumber == null || regNumber.isBlank()) {
//            this.regNumber = DEFAULT_VALUE;
//        } else {
//            this.regNumber = regNumber;
//        }
//    }
//
//    public void setSummerTyre(boolean summerTyre) {
//        this.summerTyre = summerTyre;
//    }
//
//    public void changeTyre(int month) {
//        if (month >= 4 && month <= 10) {
//            setSummerTyre(true);
//        } else {
//            setSummerTyre(false);
//        }
//
//    }
//
//    public void setKey(boolean remoteStart, boolean entryWithoutKey) {
//        this.key = new Key(remoteStart, entryWithoutKey);
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//
//    @Override
//    public String toString() {
//        return "Car {" +
//                "brand= '" + getBrand() + '\'' +
//                "; model= '" + getModel() + '\'' +
//                "; engineVolume= " + engineVolume +
//                "; color= '" +getBodyColor() +'\'' +
//                "; year= " + getReleaseYear() +
//                "; country= '" + getOriginCountry() + '\'' +
//                "; transmission= '" + transmission + '\'' +
//                "; bodyType= '" + bodyType + '\'' +
//                "; maxSpeed= " + getMaxSpeed() +
//                "; regNumber= '" + regNumber + '\'' +
//                "; numberOfSeats= " + numberOfSeats +
//                "; summerTyre= " + summerTyre +
//                "; key= " + key +
//                '}';
//    }

    public static CarType getCarType() {
        return carType;
    }

    public void setCarType(String bodyType) {

    }

//    public void doType(CarType type) {
//        switch (type) {
//            case VAN:
//                System.out.println("У машины " + getBrand() + " " + getModel());
//        }
//    }


    @Override
    public void finishMoving() {
        System.out.print("Автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void printType() {
        if (carType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип кузова: " + getCarType());
        }
    }

    @Override
    public void passDiagnostics(char pass) {
        super.passDiagnostics(pass);
    }

    @Override
    public void driverLicense() throws NoDriversLicenseException {
        if (!getDriver().isDriversLicense() || getDriver().getClass() != CatB.class) {
            throw new NoDriversLicenseException("Необходимо указать тип прав!");
        } else {
            System.out.println("У водителя " + getDriver().getFio() + " права категории B.");
        }
    }

    @Override
    public void startMoving() {
        System.out.print("Автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " на питстопе");
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
        return getCarType().toString();
    }


}
