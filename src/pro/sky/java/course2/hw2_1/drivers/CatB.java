package pro.sky.java.course2.hw2_1.drivers;

public class CatB extends Driver {

    public CatB(String fio, boolean driversLicense, int drivingExp) {
        super(fio, driversLicense, drivingExp);
    }


    @Override
    public void refuelTheCar() {
        System.out.println("Водитель автомобиля "  + getFio() + " производит заправку.");
    }

    @Override
    public void beginMovie() {
        System.out.println("Водитель автомобиля " + getFio() + " начал движение.");

    }

    @Override
    public void endMovie() {
        System.out.println("Водитель автомобиля " + getFio() + " закончил движение.");
    }


}


