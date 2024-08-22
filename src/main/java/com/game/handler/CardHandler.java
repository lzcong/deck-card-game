package com.game.handler;

import com.game.po.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardHandler {

    public static List<Card> initialCards() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        List<Card> cards = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }
        return cards;
    }

    public  static void shuffleCards(List<Card> cards) {
        Collections.shuffle(cards);
    }

}
