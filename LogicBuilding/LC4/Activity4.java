package LogicBuilding.LC4;

import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {

            int count = 1;

            if(str.charAt(i) == ' ')
                continue;

            for(int j = i + 1; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            boolean alreadyPrinted = false;

            for(int k = 0; k < i; k++) {
                if(str.charAt(i) == str.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if(!alreadyPrinted)
                System.out.println(str.charAt(i) + " - " + count);
        }

        sc.close();
    }
}
