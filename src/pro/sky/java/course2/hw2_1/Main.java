package pro.sky.java.course2.hw2_1;

public class Main {

    public static void main(String[] args) {

        Car ladaGranta = new Car();

        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.year = 2015;
        ladaGranta.country = "Russia";
        ladaGranta.color = "yellow";
        ladaGranta.engineVolume = 1.7;

        Car audiA8 = new Car();

        audiA8.brand = "Audi";
        audiA8.model = "A8";
        audiA8.year = 2020;
        audiA8.country = "Germany";
        audiA8.color = "black";
        audiA8.engineVolume = 3.0;

        Car bmwZ8 = new Car();

        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.year = 2021;
        bmwZ8.country = "Germany";
        bmwZ8.color = "black";
        bmwZ8.engineVolume = 3.0;

        Car kiaSportage4 = new Car();

        kiaSportage4.brand = "KIA";
        kiaSportage4.model = "Sportage 4-th Gen";
        kiaSportage4.year =2018;
        kiaSportage4.country = "South Korea";
        kiaSportage4.color = "red";
        kiaSportage4.engineVolume = 2.4;

        Car hyundaiAvante = new Car();

        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.year = 2016;
        hyundaiAvante.country = "South Korea";
        hyundaiAvante.color = "orange";
        hyundaiAvante.engineVolume = 1.6;

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(hyundaiAvante);


    }
}