package LogicBuilding.LC1;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("s1 : ");
        int s1 = sc.nextInt();
        System.out.print("s2 : ");
        int s2 = sc.nextInt();
        System.out.print("s3 : ");
        int s3 = sc.nextInt();
        int count = 0;
        if(s1 >=35);{
             count++;
        }
        if(s2 >= 35){
            count++;
        }
        if(s3 >= 35){
            count++;
        }
        System.out.println("Marks :" + count);
        sc.close();
       }
    
}
