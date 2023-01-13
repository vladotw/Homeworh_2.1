package pro.sky.java.course2.hw2_1.transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
//    private final int releaseYear;
//    private final String originCountry;
//    private String bodyColor;
//    private int maxSpeed;

//    private static final String DEFAULT_COLOR = "white";
//    private static final int DEFAULT_YEAR = 2000;
    private static final String DEFAULT_VALUE = "Default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
//    private static final int DEFAULT_MAXSPEED = 100;


    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);

//        setBodyColor(bodyColor);
//        setMaxSpeed(maxSpeed);

//        if (releaseYear == 0) {
//            this.releaseYear = DEFAULT_YEAR;
//        } else {
//            this.releaseYear = releaseYear;
//        }

//        if (originCountry == null || originCountry.isBlank()) {
//            this.originCountry = DEFAULT_VALUE;
//        } else {
//            this.originCountry = originCountry;
//        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
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

//    public String getBodyColor() {
//        return bodyColor;
//    }

//    public void setBodyColor(String bodyColor) {
//        if (bodyColor == null || bodyColor.isBlank()) {
//            this.bodyColor = DEFAULT_COLOR;
//        } else {
//            this.bodyColor = bodyColor;
//        }
//    }

//    public int getMaxSpeed() {
//        return maxSpeed;
//    }

//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed == 0) {
//            this.maxSpeed = DEFAULT_MAXSPEED;
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
//    }

//    public int getReleaseYear() {
//        return releaseYear;
//    }
//
//    public String getOriginCountry() {
//        return originCountry;
//    }

//    @Override
//    public String toString() {
//        return "Transport{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", releaseYear=" + releaseYear +
//                ", originCountry='" + originCountry + '\'' +
//                ", bodyColor='" + bodyColor + '\'' +
//                ", maxSpeed=" + maxSpeed +
//                '}';
//    }


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public void startMoving() {
        System.out.println("начал движение");

    }

    public void finishMoving() {
        System.out.println("закончил движение");
    }
}
