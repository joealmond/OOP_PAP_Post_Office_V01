package com.codecool.service;

import com.codecool.model.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PostOfficeTest {

    @Test
    void calculateIncome() {
        // arrange
        PostOffice postOffice = new PostOffice();

        BigBox bigbox1 = new BigBox("addr3", 100);
        BigBox bigbox2 = new BigBox("addr4", 10);

        postOffice.postMail(bigbox1);
        postOffice.postMail(bigbox2);

        // act

        double income = postOffice.calculateIncome(MailTypes.BIG_BOX);

        // assert
        assertEquals(MailTypes.BIG_BOX.getPrice() * 2 + MailTypes.BIG_BOX_FEE.getPrice() * 110, income);

    }

    @Test
    void mailsByDate() {
        // arrange
        PostOffice postOffice = new PostOffice();

        Letter letter = new Letter("addr1");
        SmallBox smbox = new SmallBox("addr2");

        postOffice.postMail(letter);
        postOffice.postMail(smbox);

        // act

        List<Mail> mailsByDate = postOffice.mailsByDate(LocalDate.parse("2023-10-19"));

        // assert
        assertEquals(2, mailsByDate.size());

    }
}