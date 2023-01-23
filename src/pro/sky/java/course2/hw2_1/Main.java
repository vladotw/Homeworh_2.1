package pro.sky.java.course2.hw2_1;

import pro.sky.java.course2.hw2_1.bus.Bus;
import pro.sky.java.course2.hw2_1.bus.BusType;
import pro.sky.java.course2.hw2_1.car.Car;
import pro.sky.java.course2.hw2_1.car.CarType;
import pro.sky.java.course2.hw2_1.drivers.*;
import pro.sky.java.course2.hw2_1.mechanic.Mechanic;
import pro.sky.java.course2.hw2_1.mechanic.ServiceStation;
import pro.sky.java.course2.hw2_1.mechanic.WorkType;
import pro.sky.java.course2.hw2_1.transport.*;
import pro.sky.java.course2.hw2_1.truck.Truck;
import pro.sky.java.course2.hw2_1.truck.TruckType;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Mechanic mechanic1 = new Mechanic("Mechanic1", "TO N1", WorkType.ALL_TYPES);
        Mechanic mechanic2 = new Mechanic("Mechanic2", "SuperFix", WorkType.ALL_TYPES);
        Mechanic mechanic3 = new Mechanic("Mechanic3", "TO and Fix", WorkType.ALL_TYPES);

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

        Car ladaGranta = new Car("Lada", "Granta", 2.0, driverB1, mechanic1, CarType.SEDAN);
        Car audiA8 = new Car("Audi", "A8", 3.0, driverB2, mechanic1, CarType.COUPE);
        Car bmwF20 = new Car("BMW", "F20", 1.6, driverB3, mechanic2, CarType.HATCHBACK);
        Car bmwF23 = new Car("BMW", "F23", 2.0, driverB4, mechanic3, CarType.SEDAN);


//        System.out.println(ladaGranta);
//        System.out.println(audiA8);

        Bus maz = new Bus("МАЗ", "МАЗ-203", 6.4, driverD1, mechanic1, BusType.MIDDLE);
        Bus nefaz = new Bus("Нефаз", "НефАЗ-5299Э", 6.7, driverD2, mechanic2, BusType.BIG);
        Bus gazel = new Bus("ГАЗельNEXT", "А65R52", 2.8, driverD3, mechanic2, BusType.SMALL);
        Bus volvoB10M = new Bus("Volvo", "B10M", 9.6, driverD4, mechanic2, BusType.VBIG);


//        System.out.println(maz);
//        System.out.println(nefaz);
//        System.out.println(gazel);

        Truck kamAZ65207 = new Truck("КамАЗ", "65207", 11.97, driverC1, mechanic3, TruckType.N3);
        Truck kamAZ43253 = new Truck("КамАЗ", "43253", 6.7, driverC2, mechanic3, TruckType.N2);
        Truck kamAZ65117 = new Truck("КамАЗ", "65117", 11.97, driverC3, mechanic3, TruckType.N1);
        Truck kamAZ6560 = new Truck("КамАЗ", "6560", 11.76, driverC4, mechanic1, TruckType.N3);

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
        driverLicense(ladaGranta);
        ladaGranta.passDiagnostics('y');

//        kamAZ65207.setTruckType(4);
        kamAZ65207.printType();
//        kamAZ43253.printType();

        maz.printType();
//        volvoB10M.setBusType(100);
//        volvoB10M.printType();

//        System.out.println();
//
//        kamAZ6560.doType(3.0F);
//        System.out.println(kamAZ6560);

//        ladaGranta.addTransport();
//        kamAZ6560.addTransport();
//        maz.addTransport();


        ladaGranta.addMechanic(mechanic1);
        ladaGranta.addMechanic(mechanic2);

        kamAZ6560.addMechanic(mechanic3);

        maz.addMechanic(mechanic2);
        maz.addMechanic(mechanic3);



//        raceTransports.add(ladaGranta);
//        raceTransports.add(kamAZ6560);
//        raceTransports.add(maz);

        List<Driver> drivers = new ArrayList<>();

        drivers.add(driverB1);
        drivers.add(driverC1);
        drivers.add(driverD1);

        transportInfo(ladaGranta);

        ServiceStation station = new ServiceStation();

        station.addTransportToQueue(ladaGranta);
        station.addTransportToQueue(kamAZ6560);
        station.addTransportToQueue(maz);

        station.condactTO();
        station.condactTO();




    }

    public static void transportInfo(Transport... transports) {
        for (Transport transport : transports) {
            System.out.println(transport.getDriver() + " " + transport.getMechanics());
        }
    }

    private static void driverLicense(Transport... transports) {
        for (Transport transport : transports) {
            try {
                transport.driverLicense();
            } catch (NoDriversLicenseException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    private static void printInfo(Transport transport) {
        System.out.println("Водитель " + transport.getDriver().getFio() + " управляет ТС " + transport.getBrand() +
                " " + transport.getModel() + " и будет учавствовать в заезде.");
        transport.printType();
    }


}