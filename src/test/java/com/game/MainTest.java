package com.game;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void startGame() {
        Assert.assertTrue(Main.startGame(1));
        Assert.assertTrue(Main.startGame(2));
        Assert.assertTrue(Main.startGame(4));
    }
}