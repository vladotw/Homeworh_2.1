package pro.sky.java.course2.hw2_1;

import java.lang.ref.PhantomReference;

public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    private static final String DEFAULT_VALUE = "Default";
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final int DEFAULT_YEAR = 2000;


    public Car(String brand, String model, int year, double engineVolume, String color, String country) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setColor(color);
        setYear(year);
        setCountry(country);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            this.year = DEFAULT_YEAR;
        }else {
            this.year = year;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand= " + brand +
                "; model= " + model +
                "; engineVolume= " + engineVolume +
                "; color= " + color +
                "; year= " + year +
                "; country= " + country +
                "}";
    }


}
