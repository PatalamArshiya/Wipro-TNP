package OOPS.Polymorphism;

public class TestFruit {

    public static void main(String[] args) {

        Fruit a = new Apple();
        Fruit o = new Orange();

        a.eat();
        System.out.println();

        o.eat();
    }
}