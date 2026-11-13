package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

// 52 cards, shuffle, and deal
public class Deck {
    // using arraylist instead of hashmap, easier to pull cards out
    private ArrayList<Card> cards;

    // 52 cards builder
    public Deck(){
        cards = new ArrayList<>();

        // array of suits and ranks(build out the card)
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // card builder
        for(String suit : suits){
            for(String rank : ranks){
                cards.add(new Card(rank,suit));
            }
        }

    }

    // shuffle
    public void shuffle(){
        Collections.shuffle(cards);
    }

    // remove card from top(pop)
    public Card deal(){
        // base case
        // null means theres nothing left
        if(cards.size() == 0) return null;

        // remove from index 0(pop)
        return cards.remove(0);
    }

}
