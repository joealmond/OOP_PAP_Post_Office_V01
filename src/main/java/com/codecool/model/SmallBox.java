package com.codecool.model;

import java.time.LocalDate;
import java.util.Objects;

import static com.codecool.model.MailTypes.SMALL_BOX;

public class SmallBox implements Mail {
    private final MailTypes type = SMALL_BOX;
    private final String address;
    private final LocalDate posted;

    public SmallBox(String address, LocalDate posted) {
        this.address = address;
        this.posted = posted;
    }

    @Override
    public double getPrice() {
        return SMALL_BOX.getPrice();
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmallBox smallBox = (SmallBox) o;
        return type == smallBox.type
                && Objects.equals(address, smallBox.address)
                && Objects.equals(posted, smallBox.posted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, address, posted);
    }
}
