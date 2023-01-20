package pro.sky.java.course2.hw2_1;

import pro.sky.java.course2.hw2_1.drivers.CatB;
import pro.sky.java.course2.hw2_1.drivers.CatC;
import pro.sky.java.course2.hw2_1.drivers.CatD;
import pro.sky.java.course2.hw2_1.transport.*;



public class Main {

    public static void main(String[] args) {


        CatB driverB1 = new CatB("NameB1", true, 1);
        CatB driverB2 = new CatB("NameB2", true, 3);
        CatB driverB3 = new CatB("NameB3", true, 5);
        CatB driverB4 = new CatB("NameB4", true, 7);

        CatD driverD1 = new CatD("NameD1", true, 3);
        CatD driverD2 = new CatD("NameD2", true, 5);
        CatD driverD3 = new CatD("NameD3", true, 7);
        CatD driverD4 = new CatD("NameD4", true, 9);

        CatC driverC1 = new CatC("NameC1", true, 2);
        CatC driverC2 = new CatC("NameC2", true, 4);
        CatC driverC3 = new CatC("NameC3", true, 6);
        CatC driverC4 = new CatC("NameC4", true, 8);

        Car ladaGranta = new Car("Lada", "Granta", 2.0, driverB1, CarType.SEDAN);
//        Car audiA8 = new Car("Audi", "A8", 3.0, driverB2);
//        Car bmwF20 = new Car("BMW", "F20", 1.6, driverB3);
//        Car bmwF23 = new Car("BMW", "F23", 2.0, driverB4);


//        System.out.println(ladaGranta);
//        System.out.println(audiA8);

        Bus maz = new Bus("МАЗ", "МАЗ-203", 6.4, driverD1, BusType.MIDDLE);
//        Bus nefaz = new Bus("Нефаз", "НефАЗ-5299Э", 6.7, driverD2);
//        Bus gazel = new Bus("ГАЗельNEXT", "А65R52", 2.8, driverD3);
//        Bus volvoB10M = new Bus("Volvo", "B10M", 9.6, driverD4);


//        System.out.println(maz);
//        System.out.println(nefaz);
//        System.out.println(gazel);

        Truck kamAZ65207 = new Truck("КамАЗ", "65207", 11.97, driverC1, TruckType.N3);
//        Truck kamAZ43253 = new Truck("КамАЗ", "43253", 6.7, driverC2);
//        Truck kamAZ65117 = new Truck("КамАЗ", "65117", 11.97, driverC3);
//        Truck kamAZ6560 = new Truck("КамАЗ", "6560", 11.76, driverC4);

//        kamAZ6560.finishMoving();
//        gazel.startMoving();
//
//        driverB1.refuelTheCar();
//        driverC2.beginMovie();
//        driverD3.endMovie();
//
//        ladaGranta.pitStop();
//        maz.bestLapTime(1.11);
//        kamAZ65117.maxSpeed(105.3);

//        printInfo(audiA8);


//        ladaGranta.setCarType("Седан");
        ladaGranta.printType();

//        kamAZ65207.setTruckType(4);
        kamAZ65207.printType();
//        kamAZ43253.printType();

//        volvoB10M.setBusType(100);
//        volvoB10M.printType();


//        System.out.println();
//
//        kamAZ6560.doType(3.0F);
//        System.out.println(kamAZ6560);


    }

    private static void printInfo(Transport transport) {
        System.out.println("Водитель " + transport.getDriver().getFio() + " управляет ТС " + transport.getBrand() +
                " " + transport.getModel() + " и будет учавствовать в заезде.");
        transport.printType();
    }


}