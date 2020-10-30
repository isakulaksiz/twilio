package com.example.twilio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInitializer {

    private final TwilioConfig twilioConfig;

    @Autowired
    private TwilioInitializer(TwilioConfig twilioConfig){
        this.twilioConfig=twilioConfig;
    }

}
