package edu.wgu.d387_sample_code.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class WelcomeMessageController {

    @GetMapping("/welcome")
    public String[] getWelcomeMessage(){

        WelcomeMessageThread english = new WelcomeMessageThread(new Locale("en","US"));
        WelcomeMessageThread french = new WelcomeMessageThread(new Locale("fr","CA"));

        Thread englishThread = new Thread(english);
        Thread frenchThread = new Thread(french);

        englishThread.start();
        frenchThread.start();

        try {
            englishThread.join();
            frenchThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new String[] {english.getMessage(),  french.getMessage()};

    }

}
