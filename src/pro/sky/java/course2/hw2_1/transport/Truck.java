package pro.sky.java.course2.hw2_1.transport;

public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void finishMoving() {
        System.out.print(getBrand() + " " + getModel() + " ");
        super.finishMoving();
    }

    @Override
    public void startMoving() {
        System.out.print(getBrand() + " " + getModel() + " ");
        super.startMoving();
    }

    @Override
    public void pitStop() {

    }

    @Override
    public void bestLapTime(double time) {
        System.out.println(getBrand() + " " + getModel() + " лучшее время круга: " + time +
                " с");
    }

    @Override
    public void maxSpeed(double speed) {
        System.out.println(getBrand() + " " + getModel() + " максимальная скорость " + speed +
                " км/ч");
    }
}
