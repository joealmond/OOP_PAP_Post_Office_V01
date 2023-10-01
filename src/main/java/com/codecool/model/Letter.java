package com.codecool.model;

import java.time.LocalDate;


import static com.codecool.model.MailTypes.LETTER;

public class Letter implements Mail {
    private final MailTypes type = LETTER;
    private final String address;

    private LocalDate posted = null;

    public Letter(String address) {
        this.address = address;
    }

    @Override
    public double getPrice() {
        return LETTER.getPrice();
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
    public void setDatePosted(LocalDate datePosted) {
        this.posted = datePosted;
    }
}
