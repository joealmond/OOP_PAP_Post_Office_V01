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
        return mails.stream()
                .filter(mail -> mail.getType().equals(type))
                .mapToDouble(mail -> mail.getPrice())
                .sum();
    }

}
