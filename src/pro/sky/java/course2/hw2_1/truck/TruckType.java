package pro.sky.java.course2.hw2_1.truck;
import java.lang.Float;

public enum TruckType {

    N1(0F, 3.5F),
    N2(3.5F, 12F),
    N3(12F, null);

    private final Float lowerBound;
    private final Float upperBound;

    TruckType(Float lowerBound, Float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public Float getLowerBound() {
        return lowerBound;
    }

    public Float getUpperBound() {
        return upperBound;
    }
}
