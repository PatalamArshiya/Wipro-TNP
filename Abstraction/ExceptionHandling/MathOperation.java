public class MathOperation {

    public static void main(String[] args) {

        System.out.println("Args length = " + args.length);

        try {

            if (args.length != 5) {
                throw new Exception("Please enter 5 integers");
            }

            int sum = 0;

            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

            double average = (double) sum / 5;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}