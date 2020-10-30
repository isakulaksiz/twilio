package com.example.twilio;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

@Service
public class TwilioSmsSender implements SmsSender {

    @Override
    public void sendSMS(SmsRequest smsRequest) {

        Message.creator(
                new PhoneNumber(smsRequest.getPhoneNum()),
                new PhoneNumber(""),
                smsRequest.getMessage()
        );
    }
}
