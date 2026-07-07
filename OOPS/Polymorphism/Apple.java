package OOPS.Polymorphism;

public class Apple extends Fruit {

    public Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    public void eat() {
        System.out.println("Fruit Name : Apple");
        System.out.println("Taste : Sweet");
    }
}