package Abstraction.Packages.com.automobile.fourwheeler;

import Abstraction.Packages.com.automobile.Vehicle;

public class Ford extends Vehicle {

    @Override
    public String getModelName() {
        return "Ford";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39FD5678";
    }

    @Override
    public String getOwnerName() {
        return "Rahul";
    }

    public int speed() {
        return 140;
    }

    public int tempControl() {
        return 22;
    }
}