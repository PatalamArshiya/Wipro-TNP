package LogicBuilding.LC4;

import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        String rev = "";

        for(int i = str2.length()-1; i>=0; i--) {
            rev = rev + str2.charAt(i);
        }

        String str3 = str1 + rev;

        System.out.println("Result = " + str3);

        sc.close();
    }
}
