package org.example.sandbox.cards;

public class Card  implements Comparable<Card> {

    private final Suit suit;
    private final FaceValue faceValue;

    public Card(Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public FaceValue getFaceValue() {
        return faceValue;
    }

     @Override
    public String toString() {
        return faceValue + " of " + suit;
    }

    @Override
    public int compareTo(Card that) {
        int suitComparison = this.suit.compareTo(that.suit);
        if (suitComparison != 0) {
            return suitComparison;
        }
        return this.faceValue.compareTo(that.faceValue);
    }
}
