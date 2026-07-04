package JavaFundamentals.Arrays;

import java.util.Arrays;

public class LargestSmallest {

    public static void main(String[] args) {

        int[] arr = {34, 12, 56, 78, 10, 89};

        Arrays.sort(arr);

        System.out.println("Smallest = " + arr[0] + ", " + arr[1]);
        System.out.println("Largest = " + arr[arr.length - 2] + ", " + arr[arr.length - 1]);
    }
}