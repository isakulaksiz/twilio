package com.example.twilio;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    private final TwilioSmsSender twilioSmsSender;

    @Autowired
    public Service(TwilioSmsSender twilioSmsSender) {
        this.twilioSmsSender = twilioSmsSender;
    }

    public void SendSMS(SmsRequest smsRequest){
        twilioSmsSender.sendSMS(smsRequest);
    }
}
