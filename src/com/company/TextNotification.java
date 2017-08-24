package com.company;

public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String Subject, String Body, String recipient, String smsProvider) {
        super(Subject, Body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() throws NoTransportation {
    }
}
