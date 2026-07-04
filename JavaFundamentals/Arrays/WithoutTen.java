package JavaFundamentals.Arrays;

import java.util.Arrays;

public class WithoutTen {

    public static void main(String[] args) {

        int[] arr = {1, 10, 4, 10, 5, 6};

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                result[index] = arr[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}