package LogicBuilding.LC3;
import java.util.Scanner;
public class Activity1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0;
        System.out.print("Enter 10 elements : ");
        for(int i=0;i<10;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("Enter sum : " + sum);

    }
    
}
