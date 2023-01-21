package pro.sky.java.course2.hw2_1.drivers;

public class CatC extends Driver {

    public CatC(String fio, boolean driversLicense, int drivingExp) {
        super(fio, driversLicense, drivingExp);
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель грузовика " + getFio() + " производит заправку.");
    }

    @Override
    public void beginMovie() {
        System.out.println("Водитель грузовика " + getFio() + " начал движение.");

    }

    @Override
    public void endMovie() {
        System.out.println("Водитель грузовика " + getFio() + " закончил движение.");
    }


    @Override
    public String getFio() {
        return super.getFio();
    }
}
