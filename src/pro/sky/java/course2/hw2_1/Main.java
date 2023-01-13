package pro.sky.java.course2.hw2_1;

import pro.sky.java.course2.hw2_1.transport.Bus;
import pro.sky.java.course2.hw2_1.transport.Car;
import pro.sky.java.course2.hw2_1.transport.Truck;

public class Main {

    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada","Granta", 2.0);
        Car audiA8 = new Car("Audi", "A8", 3.0);
        Car bmwF20 = new Car("BMW", "F20", 1.6);
        Car bmwF23 = new Car("BMW", "F23", 2.0);



//        System.out.println(ladaGranta);
//        System.out.println(audiA8);

        Bus maz = new Bus("МАЗ", "МАЗ-203", 6.4);
        Bus nefaz = new Bus("Нефаз", "НефАЗ-5299Э", 6.7);
        Bus gazel = new Bus("ГАЗельNEXT", "А65R52", 2.8);
        Bus volvoB10M = new Bus("Volvo", "B10M", 9.6);


//        System.out.println(maz);
//        System.out.println(nefaz);
//        System.out.println(gazel);

        Truck kamAZ65207 = new Truck("КамАЗ", "65207", 11.97);
        Truck kamAZ43253 = new Truck("КамАЗ", "43253", 6.7);
        Truck kamAZ65117 = new Truck("КамАЗ", "65117", 11.97);
        Truck kamAZ6560 = new Truck("КамАЗ", "6560", 11.76);

        kamAZ6560.finishMoving();

        gazel.startMoving();

        audiA8.pitStop();
        maz.bestLapTime(1.11);
        kamAZ65117.maxSpeed(105.3);
    }
}