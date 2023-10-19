package com.codecool.model;

import static com.codecool.model.MailTypes.BIG_BOX;
import static com.codecool.model.MailTypes.BIG_BOX_FEE;

public class BigBox extends Mail {
    private final MailTypes type = BIG_BOX;
    private final double gramms;

    public BigBox(String address, double gramms) {
        super(address);
        this.gramms = gramms;
    }

    @Override
    public double getPrice() {
        return calculatePrice();
    }

    @Override
    public MailTypes getType() {
        return type;
    }


    private double calculatePrice() {
        return BIG_BOX.getPrice() + gramms * BIG_BOX_FEE.getPrice();
    }
}
