package com.company;

public class Main {

    public static void main(String[] args) {
      EmailNotification email = new EmailNotification("fuck", "me", "jerry", "god");
      TextNotification text = new TextNotification("fuck", "me", "jerry", "god");



      EmailNotification clone = (EmailNotification) email.clone();
System.out.println(clone);

        email.transport();
      email.showStatus();
      text.transport();
      text.showStatus();
    }

    }


