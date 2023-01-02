package pro.sky.java.course2.hw2_1.transport;

public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int numberOfSeats;
    private boolean summerTyre;
    private Key key;

    private static final String DEFAULT_VALUE = "Default";
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final int DEFAULT_YEAR = 2000;
    private static final String DEFAULT_TRANSMISSION = "manual";
    private static final String DEFAULT_BODY_TYPE = "sedan";
    private static final int DEFAULT_NUMBEROFSEATS = 5;


    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String regNumber, int numberOfSeats, boolean summerTyre,
               boolean remoteStart, boolean entryWithoutKey) {
        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }

        setEngineVolume(engineVolume);
        setColor(color);

        if (year <= 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }

        if (country == null || country.isBlank()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }

        setTransmission(transmission);

        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = DEFAULT_BODY_TYPE;
        } else {
            this.bodyType = bodyType;
        }

        setRegNumber(regNumber);

        if (numberOfSeats <= 0) {
            this.numberOfSeats = DEFAULT_NUMBEROFSEATS;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        setSummerTyre(summerTyre);
        setKey(remoteStart, entryWithoutKey);
    }

    class Key {
        private final boolean remoteStart;
        private final boolean entryWithoutKey;

        public Key(boolean remoteStart, boolean entryWithoutKey) {
            this.remoteStart = remoteStart;
            this.entryWithoutKey = entryWithoutKey;
        }

        public boolean getRemoteStart() {
            return remoteStart;
        }

        public boolean getEntryWithoutKey() {
            return entryWithoutKey;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", entryWithoutKey=" + entryWithoutKey +
                    '}';
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean getSummerTyre() {
        return summerTyre;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = DEFAULT_TRANSMISSION;
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isBlank()) {
            this.regNumber = DEFAULT_VALUE;
        } else {
            this.regNumber = regNumber;
        }
    }

    public void setSummerTyre(boolean summerTyre) {
        this.summerTyre = summerTyre;
    }

    public void changeTyre(int month) {
        if (month >= 4 && month <= 10) {
            setSummerTyre(true);
        } else {
            setSummerTyre(false);
        }

    }

    public void setKey(boolean remoteStart, boolean entryWithoutKey) {
        this.key = new Key(remoteStart, entryWithoutKey);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", summerTyre=" + summerTyre +
                ", key=" + key +
                '}';
    }
}
