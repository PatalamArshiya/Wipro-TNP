package LogicBuilding.LC3;
import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.print("Enter 10 elements : ");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Reversed Array:");

        for (int i = 9; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

    }
    
}
