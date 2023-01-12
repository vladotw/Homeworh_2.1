package pro.sky.java.course2.hw2_1;

import pro.sky.java.course2.hw2_1.transport.Bus;
import pro.sky.java.course2.hw2_1.transport.Car;

public class Main {

    public static void main(String[] args) {

        Car ladaGranta = new Car("","", 0, "", 0,
                "", "", "", 0,"", 0, false,
                false, false);
        Car audiA8 = new Car("Audi", "A8", 3.0, "black", 2000,
                "Germany", "auto", "sedan", 160,"",5, true,
                true, true);


        System.out.println(ladaGranta);
        System.out.println(audiA8);

        Bus maz = new Bus("МАЗ", "МАЗ-203", 2005, "Беларусь",
                "синий", 106);
        Bus nefaz = new Bus("Нефаз", "НефАЗ-5299Э", 2012, "Россия",
                "желтый", 100);
        Bus gazel = new Bus("ГАЗельNEXT", "А65R52", 2019, "Россия",
                "белый", 110);

        System.out.println(maz);
        System.out.println(nefaz);
        System.out.println(gazel);


    }
}