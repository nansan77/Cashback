package ru.netology.Servts;

import org.junit.Test;

import static org.junit.Assert.*;

 public class CashbackTest {
    @Test
    public void serviceBonus() {
        Cashback service = new Cashback();
        int amount = 1000;
        int expected = service.remain(amount);
        int actual= 0;
        assertEquals(actual,expected);

    }
    @Test
    public void upToBuyAt564() {
         Cashback service = new Cashback();
         int amount = 436;
         int expected = service.remain(amount);
         int actual = 564;
         assertEquals(actual,expected);
     }
     @Test
     public void upToBuyAt200() {
         Cashback service = new Cashback();
         int amount = 800;
         int expected = service.remain(amount);
         int actual = 200;
         assertEquals(actual,expected);
     }
     @Test
     public void upToBuyAt900() {
         Cashback service = new Cashback();
         int amount = 100;
         int expected = service.remain(amount);
         int actual = 900;
         assertEquals(actual,expected);
     }
     @Test
     public void toBuy1200() {
         Cashback service = new Cashback();
         int amount = 1200;
         int expected = service.remain(amount);
         int actual = 800;
         assertEquals(actual,expected);
     }
}