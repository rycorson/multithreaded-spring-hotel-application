package edu.wgu.d387_sample_code.rest;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessageThread implements Runnable {

    private Locale locale;
    private String message;

    public WelcomeMessageThread(Locale locale){
        this.locale = locale;
    }

    public String getMessage(){
        return message;
    }

    @Override
    public void run() {

        ResourceBundle messages = ResourceBundle.getBundle("welcomeMessage", locale);
        message = messages.getString("message");

    }
}
