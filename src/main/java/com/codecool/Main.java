package com.codecool;

import com.codecool.model.*;
import com.codecool.service.PostOffice;

import java.time.LocalDate;
import java.util.List;

import static com.codecool.model.MailTypes.BIG_BOX;

public class Main {
    public static void main(String[] args) {
        Mail letter0 = new Letter("where");
        Mail letter = new Letter("where");
        System.out.println(letter.getPrice());
        Mail letter1 = new Letter("where");
        System.out.println(letter.getPrice());
        Mail smallBox = new SmallBox("where");
        System.out.println(smallBox.getPrice());
        Mail bigBox = new BigBox("there",500);
        System.out.println(bigBox.getPrice());
        Mail bigBox1 = new BigBox("there",200);
        System.out.println(bigBox.getPrice());

        PostOffice postOffice = new PostOffice();
        postOffice.postMail(letter0);
        postOffice.postMail(letter);
        postOffice.postMail(letter1);
        postOffice.postMail(smallBox);
        postOffice.postMail(bigBox);
        postOffice.postMail(bigBox1);

        List<Mail> mailsAtDate = postOffice.mailsByDate(LocalDate.parse("2023-10-01"));
        for (Mail mail : mailsAtDate) {
            System.out.println(mail.getType());
        }


        System.out.println(postOffice.calculateIncome(BIG_BOX));

    }
}