package pro.sky.java.course2.hw2_1.transport;

import pro.sky.java.course2.hw2_1.drivers.Driver;
import pro.sky.java.course2.hw2_1.drivers.NoDriversLicenseException;
import pro.sky.java.course2.hw2_1.mechanic.Mechanic;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private final T driver;
//    private Mechanic mechanic;


//    private final int releaseYear;
//    private final String originCountry;
//    private String bodyColor;
//    private int maxSpeed;

    //    private static final String DEFAULT_COLOR = "white";
//    private static final int DEFAULT_YEAR = 2000;
    private static final String DEFAULT_VALUE = "Default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;

//    private static final int DEFAULT_MAXSPEED = 100;

    public Transport(String brand, String model, double engineVolume, T driver, Mechanic mechanic) {

        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }

        setEngineVolume(engineVolume);
        this.driver = driver;
    }


//        setBodyColor(bodyColor);
//        setMaxSpeed(maxSpeed);

//        if (releaseYear == 0) {
//            this.releaseYear = DEFAULT_YEAR;
//        } else {
//            this.releaseYear = releaseYear;
//        }

//        if (originCountry == null || originCountry.isBlank()) {
//            this.originCountry = DEFAULT_VALUE;
//        } else {
//            this.originCountry = originCountry;
//        }

    List<Transport> transports = new ArrayList<>();



    List<Mechanic> mechanics = new ArrayList<>();

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }

//    public String getBodyColor() {
//        return bodyColor;
//    }

//    public void setBodyColor(String bodyColor) {
//        if (bodyColor == null || bodyColor.isBlank()) {
//            this.bodyColor = DEFAULT_COLOR;
//        } else {
//            this.bodyColor = bodyColor;
//        }
//    }

//    public int getMaxSpeed() {
//        return maxSpeed;
//    }

//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed == 0) {
//            this.maxSpeed = DEFAULT_MAXSPEED;
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
//    }

//    public int getReleaseYear() {
//        return releaseYear;
//    }
//
//    public String getOriginCountry() {
//        return originCountry;
//    }

//    @Override
//    public String toString() {
//        return "Transport{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", releaseYear=" + releaseYear +
//                ", originCountry='" + originCountry + '\'' +
//                ", bodyColor='" + bodyColor + '\'' +
//                ", maxSpeed=" + maxSpeed +
//                '}';
//    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }


    public abstract void startMoving();

    public abstract void finishMoving();

    public T getDriver() {
        return driver;
    }

    public abstract void printType();

    public void passDiagnostics(char pass) {
        if (pass == 'y') {
            System.out.println("Пройти диагностику");
        } else if (pass == 'n') {
            System.out.println("Проходить диагностику не нужно");
        } else {
            throw new IllegalArgumentException("Должны быть использованы только символы \"y\" или \"n\"");
        }
    }

    public abstract void driverLicense() throws NoDriversLicenseException;


}
