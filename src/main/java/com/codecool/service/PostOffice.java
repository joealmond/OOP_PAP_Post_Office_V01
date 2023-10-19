package com.codecool.service;

import com.codecool.model.Mail;
import com.codecool.model.MailTypes;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class PostOffice {

    private final List<Mail> mails;

    public PostOffice() {
        this.mails = new ArrayList<>();
    }

    public void postMail(Mail mail) {
        LocalDate datePosted = LocalDate.now();
        mail.setDatePosted(datePosted);
        mails.add(mail);
        System.out.println("Mail succsfully posted!");
    }

    public List<Mail> mailsByDate(LocalDate date) {
        return mails
                .stream()
                .filter(mail -> mail.getDatePosted().equals(date))
                .collect(Collectors.toList());
    }

    public double calculateIncome(MailTypes type) {
        double income = mails.stream()
                .filter(mail -> mail.getType().equals(type))
                .mapToDouble(Mail::getPrice)
                .sum();
        return Math.round(income*100)/100.0;
    }

}
