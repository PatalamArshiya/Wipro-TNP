package LogicBuilding.LC5;

import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 elements:");

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            for(int j = i + 1; j < 10; j++) {

                if(arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array after removing duplicates:");

        System.out.print(arr[0] + " ");

        for(int i = 1; i < 10; i++) {

            if(arr[i] != arr[i-1]) {
                System.out.print(arr[i] + " ");
            }

        }

        sc.close();
    }
}