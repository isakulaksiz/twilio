package com.example.twilio;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TwilioSmsSender implements SmsSender {
    private final TwilioConfig twilioConfig;

    @Autowired
    public TwilioSmsSender(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
    }


    @Override
    public void sendSMS(SmsRequest smsRequest) {
        if(isPhoneNumValid(smsRequest.getPhoneNum())){
            PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNum());
            PhoneNumber from = new PhoneNumber(twilioConfig.getTrialNum());
            String message = smsRequest.getMessage();
            MessageCreator creator = Message.creator(to, from, message);
            creator.create();
        }
        else{
            throw new IllegalArgumentException("Phone num "+smsRequest.getPhoneNum()+" is not valid number");
        }
    }

    private boolean isPhoneNumValid(String phoneNum) {
        return true; 
    }
}
