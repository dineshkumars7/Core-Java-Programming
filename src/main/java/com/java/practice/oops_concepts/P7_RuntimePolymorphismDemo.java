package com.java.practice.oops_concepts;
class Notification {
    void send() {
        System.out.println("Sending generic notification...");
    }
}

class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending Email Notification...");
    }
}

class SmsNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending SMS Notification...");
    }
}

public class P7_RuntimePolymorphismDemo {
	   public static void main(String[] args) {
	        Notification notify;

	        notify = new EmailNotification();
	        notify.send();

	        notify = new SmsNotification();
	        notify.send();
	    }
}
