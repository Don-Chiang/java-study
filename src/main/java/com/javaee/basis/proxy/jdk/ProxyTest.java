package com.javaee.basis.proxy.jdk;

public class ProxyTest {
    public static void main(String[] args) {
        SmsService proxy = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl2());
        proxy.send("I love java");
    }
}
