package com.java.practice.interfaces;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

interface SmartPhone extends Camera, MusicPlayer {
    void makeCall(String number);
}

class AndroidPhone implements SmartPhone {
    @Override
    public void takePhoto() {
        System.out.println("Capturing 50MP photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing audio track...");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }
}


public class P4_MultipleInterfaceInheritance {
	 public static void main(String[] args) {
	        SmartPhone phone = new AndroidPhone();
	        phone.takePhoto();
	        phone.playMusic();
	        phone.makeCall("+91-9876543210");
	    }
}
