package Collection.MiniProject3;

import java.util.Objects;

public class Card {
    private char symbol;
    private int number;

    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Card)) return false;
        Card c = (Card) obj;
        return symbol == c.symbol && number == c.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, number);
    }
}