package pro.sky.java.course2.hw2_1.drivers;

public abstract class Driver {
    private String fio;
    private boolean driversLicense;
    public int drivingExp;

    public Driver(String fio, boolean driversLicense, int drivingExp) {
        this.fio = fio;
        this.driversLicense = driversLicense;
        this.drivingExp = drivingExp;
    }

    public abstract void refuelTheCar();

    public abstract void beginMovie();

    public abstract void endMovie();

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public int getDrivingExp() {
        return drivingExp;
    }

    public void setDrivingExp(int drivingExp) {
        this.drivingExp = drivingExp;
    }

    @Override
    public String toString() {
        return "Driver: " +
                fio +
                ", driversLicense: " + driversLicense +
                ", drivingExp: " + drivingExp;
    }
}
