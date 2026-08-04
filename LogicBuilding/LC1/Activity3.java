package LogicBuilding.LC1;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        for(int i=1;i<=5;i++){
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            if(num >= 0){
                pos++;
            } else{
                neg++;
            }
        }
        System.out.println("Positive Numbers : " + pos);
        System.out.println("Negative Numbers : " + neg);
        sc.close();
    }
    
}
