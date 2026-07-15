package com.SystemDesign.eums;

public enum Coin {
    PENNY(1),
    NICKEL(2),
    DIME(3),
    QUARTER(5);

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
