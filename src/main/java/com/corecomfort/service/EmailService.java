package com.corecomfort.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendWelcomeEmail(String recipientEmail, String username) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("cinca.tudor.andrei@gmail.com");
        message.setTo(recipientEmail);
        message.setSubject("Welcome to Core Comfort");

        String emailText = """
        Gentile """ + username + """
        ,

        Siamo lieti di darti il benvenuto a Core Comfort! Grazie per esserti registrato nel nostro servizio. Siamo entusiasti di averti a bordo e di iniziare questo viaggio con te.

        Cosa puoi aspettarti da Core Comfort:
        - Ampia selezione di prodotti di alta qualità
        - Offerte e promozioni esclusive
        - Spedizioni veloci e affidabili
        - Servizio clienti dedicato

        Per iniziare, puoi esplorare la nostra gamma di prodotti sul nostro sito web all'indirizzo [Link al tuo sito web]. Aggiungi i prodotti che ami al carrello e procedi con il pagamento in modo semplice e sicuro.

        Se hai domande o hai bisogno di assistenza, il nostro team di supporto è qui per aiutarti. Puoi contattarci all'indirizzo email [Indirizzo email del supporto] o chiamarci al [Numero di telefono del supporto].

        Grazie ancora per esserti unito a Core Comfort. Siamo entusiasti di offrirti un'esperienza di shopping eccezionale.

        Cordiali saluti,
        Il team di Core Comfort
    """;

        String emailTextEng = """
        Dear """ + username + """
        ,

        We are pleased to welcome you to Core Comfort! Thank you for registering with our service. We're excited to have you on board and start this journey with you.

        What you can expect from Core Comfort:
        - Wide selection of high-quality products
        - Exclusive offers and promotions
        - Fast and reliable shipping
        - Dedicated customer support

        To get started, you can explore our range of products on our website at [Your Website Link]. Add the products you love to your cart and proceed with a simple and secure checkout.

        If you have any questions or need assistance, our support team is here to help. You can reach us at [Support Email Address] or call us at [Support Phone Number].

        Thank you again for joining Core Comfort. We're excited to provide you with an exceptional shopping experience.

        Best regards,
        The Core Comfort Team
    """;


        message.setText(emailText);

        mailSender.send(message);
        System.out.println("Mail Sent successfully...");
    }
}
