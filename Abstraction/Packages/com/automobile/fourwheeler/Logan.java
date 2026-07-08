package Abstraction.Packages.com.automobile.fourwheeler;

import Abstraction.Packages.com.automobile.Vehicle;

public class Logan extends Vehicle {

    @Override
    public String getModelName() {
        return "Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39LG1234";
    }

    @Override
    public String getOwnerName() {
        return "Arshiya";
    }

    public int speed() {
        return 120;
    }

    public int gps() {
        return 1;
    }
}