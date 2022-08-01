package com.javaee.basis.questions;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestMain {
    public static void main(String[] args) throws Exception {
        Class<?> targetClass = Class.forName("com.javaee.basis.questions.TargetObjet");
        final TargetObjet targetObjet = (TargetObjet) targetClass.newInstance();

        final Method[] declaredMethods = targetClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
        final Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
        publicMethod.invoke(targetObjet,"java");

        final Field field = targetClass.getDeclaredField("value");
        field.setAccessible(true);
        field.set(targetObjet, "jiangnan");

        final Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObjet);

    }


    public static void swap(Person person1, Person person2) {
        Person temp = person1;
        person1 = person2;
        person2 = temp;
        System.out.println("person1:" + person1.getName());
        System.out.println("person2:" + person2.getName());
    }

    public static String str(String append) {
        try {
            Integer[] array = {};
            return "444";

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("111");
            return "222";
        } finally {
            System.out.println("3333");
            return "555";
        }

    }

    public native void method();
}
