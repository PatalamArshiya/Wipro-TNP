package Abstraction.InterfaceNewFeatures;

public interface FourWheeler {
    default void message(){
        System.out.println("Inside fourWheeler");
    }
    
}
