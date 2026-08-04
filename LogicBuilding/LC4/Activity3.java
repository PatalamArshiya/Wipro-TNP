package LogicBuilding.LC4;
import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        String str3 = str1 + str2;

        System.out.println("Concatenated String = " + str3);

        sc.close();
    }
}

