package com.codecool.model;

import java.time.LocalDate;

import static com.codecool.model.MailTypes.BIG_BOX;
import static com.codecool.model.MailTypes.BIG_BOX_FEE;

public class BigBox implements Mail {
    private final MailTypes type = BIG_BOX;
    private final double gramms;
    private final String address;

    private LocalDate posted = null;

    public BigBox(String address, double gramms) {
        this.address = address;
        this.gramms = gramms;
    }

    private double calculatePrice() {
        return BIG_BOX.getPrice() + gramms * BIG_BOX_FEE.getPrice();
    }

    @Override
    public double getPrice() {
        return calculatePrice();
    }

    @Override
    public LocalDate getPosted() {
        return posted;
    }

    @Override
    public MailTypes getType() {
        return type;
    }

    @Override
    public void setPosted(LocalDate posted) {
        this.posted = posted;
    }

}
