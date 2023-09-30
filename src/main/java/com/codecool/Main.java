package com.codecool;

import com.codecool.model.*;
import com.codecool.service.PostOffice;

import java.time.LocalDate;
import java.util.Set;

import static com.codecool.model.MailTypes.BIG_BOX;

public class Main {
    public static void main(String[] args) {
        Mail letter = new Letter("where", LocalDate.parse("2023-01-10"));
        System.out.println(letter.getPrice());
        Mail letter1 = new Letter("where", LocalDate.parse("2023-01-10"));
        System.out.println(letter.getPrice());
        Mail smallBox = new SmallBox("where", LocalDate.parse("2023-01-10"));
        System.out.println(smallBox.getPrice());
        Mail bigBox = new BigBox("there",LocalDate.parse("2023-01-10"),500);
        System.out.println(bigBox.getPrice());
        Mail bigBox1 = new BigBox("there",LocalDate.parse("2023-01-10"),200);
        System.out.println(bigBox.getPrice());

        PostOffice postOffice = new PostOffice();
        postOffice.addMail(letter);
        postOffice.addMail(letter1);
        postOffice.addMail(smallBox);
        postOffice.addMail(bigBox);
        postOffice.addMail(bigBox1);

        Set<Mail> mails20230110 = postOffice.mailsByDate(LocalDate.parse("2023-01-10"));
        for (Mail mail : mails20230110) {
            System.out.println(mail.getType());
        }


        System.out.println(postOffice.calculateIncome(BIG_BOX));

    }
}