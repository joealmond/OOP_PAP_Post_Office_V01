package com.codecool.model;

import java.time.LocalDate;

import static com.codecool.model.MailTypes.SMALL_BOX;

public class SmallBox implements Mail {
    private final MailTypes type = SMALL_BOX;
    private final String address;

    private LocalDate posted = null;

    public SmallBox(String address) {
        this.address = address;
    }

    @Override
    public double getPrice() {
        return SMALL_BOX.getPrice();
    }

    @Override
    public LocalDate getDatePosted() {
        return posted;
    }

    @Override
    public MailTypes getType() {
        return type;
    }

    @Override
    public void setDatePosted(LocalDate posted) {
        this.posted = posted;
    }

}
