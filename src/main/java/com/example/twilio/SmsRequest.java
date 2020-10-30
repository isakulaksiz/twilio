package com.example.twilio;

public class SmsRequest {

    private final String phoneNum;
    private final String message;

    public SmsRequest(String phoneNum, String message) {
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
