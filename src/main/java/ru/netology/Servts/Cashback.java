package ru.netology.Servts;

public class Cashback {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }

}

