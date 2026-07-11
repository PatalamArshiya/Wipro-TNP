package WrapperClasses;

import java.util.Scanner;

public class Binary8Bit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);

        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println("8-bit Binary: " + binary);

        sc.close();
    }
}