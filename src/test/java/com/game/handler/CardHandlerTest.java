package com.game.handler;

import org.junit.Assert;

public class CardHandlerTest {

    @org.junit.Test
    public void initialCards() {
        Assert.assertEquals(CardHandler.initialCards().toArray().length, 52);
    }

    @org.junit.Test
    public void shuffleCards() {
    }
}