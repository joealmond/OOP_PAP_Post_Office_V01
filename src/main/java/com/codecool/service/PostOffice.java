package com.codecool.service;

import com.codecool.model.Mail;
import com.codecool.model.MailTypes;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class PostOffice {

    private final Set<Mail> mails;

    public PostOffice() {
        this.mails = new HashSet<>();
    }

    public void addMail(Mail mail) {
        mails.add(mail);
        System.out.println("Mail succsfully added!");
    }

    public void addAllMails(Set<Mail> mails) {
        this.mails.addAll(mails);
        System.out.println("Mails succsfully added!");
    }

    public Set<Mail> mailsByDate(LocalDate date) {
        return mails
                .stream()
                .filter(mail -> mail.getPosted().equals(date))
                .collect(Collectors.toSet());
    }

    public double calculateIncome(MailTypes type) {
        double sum = 0;
        for (Mail mail : mails) {
            if (mail.getType().equals(type)) {
                sum += mail.getPrice();
            }
        }
        return sum;
    }

}
