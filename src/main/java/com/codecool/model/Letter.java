package com.codecool.model;

import static com.codecool.model.MailTypes.LETTER;

public class Letter extends Mail {
    private final MailTypes type = LETTER;

    public Letter(String address) {
        super(address);
    }

    @Override
    public double getPrice() {
        return LETTER.getPrice();
    }

    @Override
    public MailTypes getType() {
        return type;
    }

}
