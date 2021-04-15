package ru.netology.servis;

 junit4
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackTest {

    @Test
    public void serviceBonus() {

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackTest {
    @org.junit.jupiter.api.Test
    void serviceBonus() {
 master
        Cashback service = new Cashback();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
 junit4

    }

    @Test
    public void upToBuyAt564() {

    }

    @Test
    void upToBuyAt564() {
 master
        Cashback service = new Cashback();
        int amount = 436;
        int actual = service.remain(amount);
        int expected = 564;
        assertEquals(expected, actual);
    }

    @Test
 junit4
    public void upToBuyAt200() {

    void upToBuyAt200() {
 master
        Cashback service = new Cashback();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(expected, actual);
    }

    @Test
junit4
    public void upToBuyAt900() {

    void upToBuyAt900() {
 master
        Cashback service = new Cashback();
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
 junit4
    public void toBuy1200() {

    void toBuy1200() {
 master
        Cashback service = new Cashback();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(expected, actual);
    }
 junit4
}


}




 master
