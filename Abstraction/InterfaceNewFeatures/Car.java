package Abstraction.InterfaceNewFeatures;

public class Car implements Vehicle, FourWheeler {
    @Override
    public void message(){
        System.out.println("Inside Vehicle");
    }
    
}
