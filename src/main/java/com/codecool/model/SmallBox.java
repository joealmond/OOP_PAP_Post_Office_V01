package com.codecool.model;

import static com.codecool.model.MailTypes.SMALL_BOX;

public class SmallBox extends Mail {
    private final MailTypes type = SMALL_BOX;

    public SmallBox(String address) {
        super(address);
    }

    @Override
    public double getPrice() {
        return SMALL_BOX.getPrice();
    }

    @Override
    public MailTypes getType() {
        return type;
    }
}
