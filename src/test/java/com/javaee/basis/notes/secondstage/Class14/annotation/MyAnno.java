package com.javaee.basis.notes.secondstage.Class14.annotation;


public @interface MyAnno {

     int value();
    Person per();
    MyAnno2 anno2();
    String[] strs();
     /*String name() default "张三";*/
     /*String show2();

     Person per();
     MyAnno2 anno2();

     String[] strs();*/


}
