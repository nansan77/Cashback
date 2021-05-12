package ru.netology.servis;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackTest {

    @Test
    void serviceBonus() {
        Cashback service = new Cashback();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @Test
    void upToBuyAt564() {
        Cashback service = new Cashback();
        int amount = 436;
        int actual = service.remain(amount);
        int expected = 564;
        assertEquals(actual,expected);
    }

    @Test
    void upToBuyAt200() {
        Cashback service = new Cashback();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual,expected);
    }

    @Test
    void upToBuyAt900() {
        Cashback service = new Cashback();
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual,expected);
    }

    @Test
    void toBuy1200() {
        Cashback service = new Cashback();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(actual,expected);
    }

}




