package JavaFundamentals.Arrays;

public class Sum67 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 6, 99, 99, 7, 3, 4};

        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 6) {
                ignore = true;
            }

            if (!ignore) {
                sum = sum + arr[i];
            }

            if (ignore && arr[i] == 7) {
                ignore = false;
            }
        }

        System.out.println("Sum = " + sum);
    }
}