package Collection.MiniProject3;

import java.util.*;

public class CardMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Card> set = new LinkedHashSet<>();
        Map<Character, Card> map = new TreeMap<>();

        while (map.size() < 4) {
            System.out.println("Enter a card :");
            char symbol = sc.next().toLowerCase().charAt(0);
            int number = sc.nextInt();

            Card card = new Card(symbol, number);
            set.add(card);

            if (!map.containsKey(symbol)) {
                map.put(symbol, card);
            }
        }

        System.out.println("Four symbols gathered in " + set.size() + " cards.");
        System.out.println("Cards in Set are :");

        for (Card c : map.values()) {
            System.out.println(c.getSymbol() + " " + c.getNumber());
        }

        sc.close();
    }
}