package LogicBuilding.LC3;
import java.util.Scanner;
public class Activity4 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = 30;

        int[] marks = new int[N];
        int[] count = new int[101];

        System.out.println("Enter marks of 30 students:");

        for (int i = 0; i < N; i++) {
            marks[i] = sc.nextInt();

            if (marks[i] >= 0 && marks[i] <= 100) {
                count[marks[i]]++;
            }
        }

        System.out.println("Count of each mark:");

        for (int i = 0; i <= 100; i++) {

            if (count[i] > 0) {
                System.out.println(i + " = " + count[i]);
            }
        }

        sc.close();
    }
}
    
