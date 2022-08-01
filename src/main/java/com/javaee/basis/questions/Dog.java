package com.javaee.basis.questions;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog extends Object {

    private String name;

    private int age;

    static int wealth = 3;

    public  Dog(String name) {
        int a = wealth;
        this.name = name;
    }

    public static void main(String[] args) {
        List<String> orgList = Lists.newArrayList("武汉大学中国传统文化研究中心人文社科,湖北武汉430072".split(" |、|,|，|；|;|\\."));
        for (String s : orgList) {
            System.out.println(s);
        }
    }

}
