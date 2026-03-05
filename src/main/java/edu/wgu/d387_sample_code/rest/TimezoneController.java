package edu.wgu.d387_sample_code.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TimezoneController {

    @GetMapping("/presentation")
    public String[] getPresentationTime() {
        LocalDateTime presentationDateTime = LocalDateTime.of(2026, 4, 30, 18, 30);

        ZonedDateTime easternTimeZone = ZonedDateTime.of(presentationDateTime, ZoneId.of("America/New_York"));

        ZonedDateTime mountainTimeZone = easternTimeZone.withZoneSameInstant(ZoneId.of("America/Denver"));

        ZonedDateTime utcTime = easternTimeZone.withZoneSameInstant(ZoneId.of("UTC"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");

        String presentationMessage = "Join us for an online live presentation held at the Landon Hotel on " +
                easternTimeZone.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")) + " at " +
                easternTimeZone.format(formatter) + " ET / " +
                mountainTimeZone.format(formatter) + " MT / " +
                utcTime.format(formatter) + " UTC.";

        return new String[] {presentationMessage};
    }

}
