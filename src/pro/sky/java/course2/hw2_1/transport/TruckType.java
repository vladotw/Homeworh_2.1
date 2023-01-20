package pro.sky.java.course2.hw2_1.transport;

public enum TruckType {

    N1("Грузоподъёмность до 3,5 тонн"),
    N2("Грузоподъёмность от 3,5 до 12 тонн"),
    N3("Грузоподъёмность больше 12 тонн");

    public static final float BORDER_1 = 3.5F;
    public static final float BORDER_2 = 12F;
    private final String weight;

    TruckType(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return weight;
    }


}
