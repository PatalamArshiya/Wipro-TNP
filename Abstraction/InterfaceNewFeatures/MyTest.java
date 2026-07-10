package Abstraction.InterfaceNewFeatures;

@FunctionalInterface
interface MyInterface {
    int myFunction(int a, int b, int c);
}

public class MyTest {

    public static void main(String[] args) {

        MyInterface t1 = (a, b, c) -> a + b + c;

        MyInterface t2 = (a, b, c) -> a * b * c;

        System.out.println("Addition = " + t1.myFunction(10, 20, 30));
        System.out.println("Multiplication = " + t2.myFunction(10, 20, 30));
    }
}