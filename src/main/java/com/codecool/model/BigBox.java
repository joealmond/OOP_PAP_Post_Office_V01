package com.codecool.model;

import java.time.LocalDate;
import java.util.Objects;

import static com.codecool.model.MailTypes.BIG_BOX;
import static com.codecool.model.MailTypes.BIG_BOX_FEE;

public class BigBox implements Mail {
    private final MailTypes type = BIG_BOX;
    private final double gramms;
    private final String address;
    private final LocalDate posted;

    public BigBox(String address, LocalDate posted, double gramms) {
        this.address = address;
        this.posted = posted;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BigBox bigBox = (BigBox) o;
        return Double.compare(gramms, bigBox.gramms) == 0
                && type == bigBox.type
                && Objects.equals(address, bigBox.address)
                && Objects.equals(posted, bigBox.posted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, address, posted, gramms);
    }
}
