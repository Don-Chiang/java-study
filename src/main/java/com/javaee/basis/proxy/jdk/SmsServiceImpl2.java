package com.javaee.basis.proxy.jdk;

public class SmsServiceImpl2 implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("smsServiceImpl2 send message:" + message);
        return message;
    }
}
