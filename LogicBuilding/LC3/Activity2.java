package LogicBuilding.LC3;

import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[20];

        System.out.println("Enter 20 elements:");

        for (int i = 0; i < 20; i++) {
            a[i] = sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        for (int i = 0; i < 20; i++) {

            if (a[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = a[i];
            }
            else if (a[i] > max2) {
                max3 = max2;
                max2 = a[i];
            }
            else if (a[i] > max3) {
                max3 = a[i];
            }

            if (a[i] < min1) {
                min3 = min2;
                min2 = min1;
                min1 = a[i];
            }
            else if (a[i] < min2) {
                min3 = min2;
                min2 = a[i];
            }
            else if (a[i] < min3) {
                min3 = a[i];
            }
        }

        System.out.println("Largest 3 elements:");
        System.out.println(max1 + " " + max2 + " " + max3);

        System.out.println("Smallest 3 elements:");
        System.out.println(min1 + " " + min2 + " " + min3);

        sc.close();
    }
}