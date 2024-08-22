package com.game.po;


import java.util.List;

public class Player {
    private String name;
    private List<Card> cards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Player(String playerName, List<Card> cards) {
        this.name = playerName;
        this.cards = cards;
    }

    public String toString(){
        return name + " hands on: " + cards;
    }
}
