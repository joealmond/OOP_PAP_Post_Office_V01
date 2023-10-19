package com.codecool.model;

import java.time.LocalDate;

public abstract class Mail {
    protected final String address;
    protected LocalDate posted;

    public Mail(String address) {
        this.posted = null;
        this.address = address;
    }

    public abstract double getPrice();

    public abstract MailTypes getType();

    public LocalDate getDatePosted() {
        return posted;
    }

    public void setDatePosted(LocalDate posted) {
        System.out.println("poste on: " + posted);
        this.posted = posted;
    }
}