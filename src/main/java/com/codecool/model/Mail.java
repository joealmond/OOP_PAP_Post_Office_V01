package com.codecool.model;

import java.time.LocalDate;

public interface Mail {
    double getPrice();
    LocalDate getDatePosted();
    void setDatePosted(LocalDate datePosted);
    MailTypes getType();
}
