package pro.sky.java.course2.hw2_1.car;

public enum CarType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    OFFROADER("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");


    private final String carType;

    CarType(String carType) {
        this.carType = carType;
    }

    public static CarType findByName(String carType) {
        for (CarType type : values()) {
            if (type.getCarType().equals(carType)) {
                return type;
            }
        }
        return null;
    }

    public String getCarType() {

        return carType;
    }

    @Override
    public String toString() {
        return carType;
    }
}
