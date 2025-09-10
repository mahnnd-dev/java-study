package dev.m.field;

public class SmsSender implements NotifySender {

    @Override
    public void sendNotify(String title, String email) {
        System.out.println("SmsSender to " + email + " title " + title);

    }
}
