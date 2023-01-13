package pro.sky.java.course2.hw2_1.transport;

public class Bus extends Transport {


    public Bus(String brand, String model, double engineVolume) {
        super(brand,model, engineVolume);
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
}



