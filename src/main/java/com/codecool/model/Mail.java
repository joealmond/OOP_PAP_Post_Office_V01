package com.codecool.model;

import java.time.LocalDate;

public interface Mail {
    double getPrice();
    LocalDate getPosted();
    MailTypes getType();
}
