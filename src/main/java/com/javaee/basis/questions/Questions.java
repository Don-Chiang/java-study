package com.javaee.basis.questions;

import com.alibaba.fastjson.JSONObject;


public class Questions {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        if (jsonObject == null){
            System.out.println("null");
        }else {
            System.out.println("not null");
        }

    }

    public static Dog foo(Dog someDog) {
        someDog.setName("Max");     // AAA
        someDog = new Dog("Fifi");  // BBB
        someDog.setName("Rowlf");   // CCC
        return someDog;
    }

    public  Dog eat(Dog someDog) {
        Dog.wealth = Dog.wealth - 1;
        String a = "3";

        return null;
    }
}
