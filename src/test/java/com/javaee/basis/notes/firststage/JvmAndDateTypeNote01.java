package com.javaee.basis.notes.firststage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JvmAndDateTypeNote01 {

    /**<jvm/>
     *01: JVM（Java Virtual Machine ）：Java虚拟机，简称JVM，是运行所有Java程序的假想计算机，是Java程序的 运行环境，
     * 是Java 最具吸引力的特性之一。我们编写的Java代码，都运行在 JVM 之上。
     * 跨平台：任何软件的运行，都必须要运行在操作系统之上，而我们用Java编写的软件可以运行在任何的操作系 统上，这个特性称为Java语言的跨平台特性。
     * 该特性是由JVM实现的，我们编写的程序运行在JVM上，而JVM 运行在操作系统上。
     * 02:JRE (Java Runtime Environment) ：是Java程序的运行时环境，包含 JVM 和运行时所需要的 核心类库 。
     * 03:JDK (Java Development Kit)：是Java程序开发工具包，包含 JRE 和开发人员使用的工具。JDK>Jre>Jvm
     *jdk下载官网地址:https://www.oracle.com/java/technologies/javase-downloads.html
     *
     *
     */

    /**
     * <数据类型>
     * 基本数据类型【今天重点】
     * 	整数型	byte(1个字节) short(2个字节) int(4个字节) long(8个字节)
     * 	浮点型	float(4个字节) double(8个字节)
     * 	字符型	char(2个字节)
     * 	布尔型	boolean(1个字节)
     *
     * 引用数据类型
     * 	字符串、数组、类、接口、Lambda
     *
     * 注意事项：
     * 1. 字符串不是基本类型，而是引用类型。
     * 2. 浮点型可能只是一个近似值，并非精确的值。
     * 3. 数据范围与字节数不一定相关，例如float数据范围比long更加广泛，但是float是4字节，long是8字节。
     * 4. 浮点数当中默认类型是double。如果一定要使用float类型，需要加上一个后缀F。
     *    如果是整数，默认为int类型，如果一定要使用long类型，需要加上一个后缀L。推荐使用大写字母后缀。
     */

    /**
     * <运算符/>
     * 一元运算符：只需要一个数据就可以进行操作的运算符。例如：取反!、自增++、自减--
     * 二元运算符：需要两个数据才可以进行操作的运算符。例如：加法+、赋值=
     * 三元运算符：需要三个数据才可以进行操作的运算符。
     * 格式：
     * 数据类型 变量名称 = 条件判断 ? 表达式A : 表达式B;
     * 流程：
     * 首先判断条件是否成立：
     * 如果成立为true，那么将表达式A的值赋值给左侧的变量；
     * 如果不成立为false，那么将表达式B的值赋值给左侧的变量；
     * 二者选其一。
     * <p>
     * 注意事项：
     * 1. 必须同时保证表达式A和表达式B都符合左侧数据类型的要求。
     * 2. 三元运算符的结果必须被使用。
     */

    /**
     * <method方法>
     * 方法重载：指在同一个类中，允许存在一个以上的同名方法，只要它们的参数列表不同即可，与修饰符和返 回值类型无关。
     * 参数列表：个数不同，数据类型不同，顺序不同。
     * 重载方法调用：JVM通过方法的参数列表，调用不同的方法。
     */

    @Test
    public void demo01() {
        //同时定义多个变量
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    @Test
    public void demo02() {
        int a = 10;
        int b = 20;

        // 数据类型 变量名称 = 条件判断 ? 表达式A : 表达式B;
        // 判断a > b是否成立，如果成立将a的值赋值给max；如果不成立将b的值赋值给max。二者选其一
        int max = a > b ? a : b; // 最大值的变量
        System.out.println("最大值：" + max); // 20

        // int result = 3 > 4 ? 2.5 : 10; // 错误写法！

        System.out.println(a > b ? a : b); // 正确写法！

        // a > b ? a : b; // 错误写法！
    }



}
