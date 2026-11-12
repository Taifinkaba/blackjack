package com.pluralsight;

public class Card {
    private String rank;
    private String suit;

    // constructor
    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    // getters
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    // get value of ranked cards: Ace, Jack, Queen, King
    public int getValue(){
        String lowercaseRank = rank.toLowerCase();

        if (lowercaseRank.equals("ace")) {
            // default score but in blackjack it can also be 1
            return 11;
        } else if (lowercaseRank.equals("jack") || lowercaseRank.equals("queen") || lowercaseRank.equals("king")) {
            return 10;
        } else {
            return Integer.parseInt(lowercaseRank);
        }
    }

    // display a readable card
    public String toString(){
        return rank + "of" + suit;
    }

}
