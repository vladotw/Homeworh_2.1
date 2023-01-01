package pro.sky.java.course2.hw2_1;

public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;


    public Car(String brand, String model, int year, double engineVolume, String color, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
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
