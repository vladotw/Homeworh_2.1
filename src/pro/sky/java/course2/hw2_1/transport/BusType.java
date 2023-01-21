package pro.sky.java.course2.hw2_1.transport;

import java.security.PublicKey;

public enum BusType {
    VSMALL(0, 10),
    SMALL(10, 25),
    MIDDLE(40, 50),
    BIG(60, 80),
    VBIG(100, 120);

    private final int minCapacity;
    private final int maxCapacity;

    BusType(int minCapacity, int maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
    }

    public int getMinCapacity() {
        return minCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
