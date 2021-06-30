package com.vdab.services;

import com.vdab.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendEmail(Contact contact) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(contact.getEmail());
        message.setTo("margauxluyten@gmail.com");
        message.setSubject(contact.getName() + " " + contact.getPhoneNumber());
        message.setText(contact.getMessage());
        emailSender.send(message);
    }
}
