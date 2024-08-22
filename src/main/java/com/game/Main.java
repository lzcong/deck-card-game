package com.game;

import com.game.handler.CardHandler;
import com.game.po.Card;
import com.game.po.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of player：");
        int num = scanner.nextInt();
        startGame(num);
    }

    public static boolean startGame(int num) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String playerName = "Player" + (i + 1);
            List<Card> cards = new ArrayList<>();
            Player player = new Player(playerName, cards);
            players.add(player);
        }

        List<Card> cardList = CardHandler.initialCards();
        CardHandler.shuffleCards(cardList);

        while (!cardList.isEmpty()) {
            for (int i = 0; i < num; i++) {
                players.get(i).getCards().add(cardList.removeFirst());
            }
        }

        for (Player player : players) {
            System.out.println(player);
        }
        return true;
    }
}