package com.example.twilio;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class SmsRequest {

    @NotBlank
    private final String phoneNum;

    @NotBlank
    private final String message;

    public SmsRequest(@JsonProperty("phoneNum") String phoneNum, @JsonProperty("message") String message) {
        this.phoneNum = phoneNum;
        this.message = message;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "SmsRequest{" +
                "phoneNum='" + phoneNum + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
