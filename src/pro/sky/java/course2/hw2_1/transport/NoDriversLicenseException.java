package pro.sky.java.course2.hw2_1.transport;

import pro.sky.java.course2.hw2_1.drivers.CatC;
import pro.sky.java.course2.hw2_1.drivers.Driver;

public class NoDriversLicenseException extends Exception{


    public NoDriversLicenseException(String message) {
        super(message);
    }
}
