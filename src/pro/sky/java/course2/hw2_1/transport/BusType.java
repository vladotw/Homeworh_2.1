package pro.sky.java.course2.hw2_1.transport;

import java.security.PublicKey;

public enum BusType {
    VSMALL("Вместимость: до 10 мест"),
    SMALL("Вместимость: до 25 мест"),
    MIDDLE("Вместимость: 40–50 мест"),
    BIG("Вместимость: 60–80 мест"),
    VBIG("Вместимость: 100–120 мест");

    private final String busType;



    BusType(String busType ) {
        this.busType = busType;
    }



    public String getBusType() {
        return busType;
    }

    @Override
    public String toString() {
        return busType;
    }
}
