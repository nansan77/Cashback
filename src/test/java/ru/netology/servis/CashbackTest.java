package ru.netology.servis;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackTest {

class CashbackTest {
    @org.junit.jupiter.api.Test
    void serviceBonus() {
        Cashback service = new Cashback();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }


    @Test
    public void serviceBonus2() {
        Cashback service = new Cashback();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void serviceBonus1() {
        Cashback service = new Cashback();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void serviceBonus() {
        Cashback service = new Cashback();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}
