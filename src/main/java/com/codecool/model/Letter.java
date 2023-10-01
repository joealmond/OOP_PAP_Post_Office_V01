package com.codecool.model;

import java.time.LocalDate;
import java.util.Objects;

import static com.codecool.model.MailTypes.LETTER;

public class Letter implements Mail {
    private final MailTypes type = LETTER;
    private final String address;
    private final LocalDate posted;

    public Letter(String address) {
        this.address = address;
        this.posted = LocalDate.now();
    }
    public Letter(String address, LocalDate posted) {
        this.address = address;
        this.posted = posted;
    }

    @Override
    public double getPrice() {
        return LETTER.getPrice();
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
        Letter letter = (Letter) o;
        return type == letter.type
                && Objects.equals(address, letter.address)
                && Objects.equals(posted, letter.posted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, address, posted);
    }
}
