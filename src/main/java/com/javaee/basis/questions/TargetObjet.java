package com.javaee.basis.questions;

public class TargetObjet {
    private String value;

    public TargetObjet() {
        value = "JavaGuide";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
