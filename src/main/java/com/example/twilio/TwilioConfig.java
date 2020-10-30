package com.example.twilio;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("twilio")
public class TwilioConfig {
    private String accountSid;
    private String authToken;
    private String trialNum;

    public TwilioConfig(){

    }

    public String getAccountSid() {
        return accountSid;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getTrialNum() {
        return trialNum;
    }

    public void setTrialNum(String trialNum) {
        this.trialNum = trialNum;
    }
}
