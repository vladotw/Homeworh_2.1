package pro.sky.java.course2.hw2_1;

public class Main {

    public static void main(String[] args) {

        Car ladaGranta = new Car("","", 0, 0, "",
                "");
        Car audiA8 = new Car("Audi", "A8", 2020, 3.0, "black",
                "Germany");
        Car bmwZ8 = new Car("BMW", "Z8", 2021, 3.0, "black",
                "Germany");
        Car kiaSportage4 = new Car("KIA", "Sportage 4-th Gen", 2018, 2.4, "red",
                "South Korea");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, 1.6, "orange",
                "South Korea");

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(hyundaiAvante);

    }
}