package com.codecool.model;

public enum MailTypes {
    LETTER(1.99),
    SMALL_BOX(7.99),
    BIG_BOX(10.29),
    BIG_BOX_FEE(0.29);

    private final double price;

    MailTypes(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}