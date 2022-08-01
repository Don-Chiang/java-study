package com.javaee.basis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 **/

@SpringBootApplication
public class JavaBasisApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaBasisApplication.class,args);

    }


    /*例如 int i = 10;  int j = i << 1;

    i = 10 : 十进制 是10，二进制是 1010

    i << 1: 左移1位，二进制变为 10100，转换位十进制 则是 20

    结论，j = 20,也就是 左移1位，相当于 乘以2，以此类推，<< 2 相当于乘以 4



    例如 int i = 20;  int j = i >> 1;

    i = 20 : 十进制 是20，二进制是 10100

    i >> 1: 右移1位，二进制变为01010，转换位十进制 则是 10

    结论，j = 10,也就是 右移1位，相当于 除以2，以此类推，>> 2 相当于除以 4*/

}
