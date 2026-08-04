package LogicBuilding.LC1;

import java.util.Scanner;
public class Activity1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value Of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the Value Of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the Value Of c : ");
        int c = sc.nextInt();

        int temp = a;
        a =c;
        c=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        sc.close();

    }
}