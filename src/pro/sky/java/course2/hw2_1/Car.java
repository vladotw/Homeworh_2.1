package pro.sky.java.course2.hw2_1;

public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;


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
