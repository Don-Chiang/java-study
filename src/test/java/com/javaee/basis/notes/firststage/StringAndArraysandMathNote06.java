package com.javaee.basis.notes.firststage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StringAndArraysandMathNote06 {

    /**
     * String常用方法
     * public boolean equals (Object anObject) ：将此字符串与指定对象进行比较
     * public boolean equalsIgnoreCase (String anotherString) ：将此字符串与指定对象进行比较，忽略大小 写。
     * public int length () ：返回此字符串的长度。
     * public String concat (String str) ：将指定的字符串连接到该字符串的末尾。
     * public char charAt (int index) ：返回指定索引处的 char值。
     * public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
     * public String substring (int beginIndex) ：返回一个子字符串，从beginIndex开始截取字符串到字符 串结尾。
     * public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到 endIndex截取字符串。含beginIndex，不含endIndex
     * public char[] toCharArray () ：将此字符串转换为新的字符数组。
     * public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组。
     * public String replace (CharSequence target, CharSequence replacement) ：将与target匹配的字符串使用replacement字符串替换
     * public String[] split(String regex) ：将此字符串按照给定的regex（规则）拆分为字符串数组。
     */
    @Test
    public void stringTest01(){
        // String底层是靠字符数组实现的。
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println(str);
        //CharSequence 是一个接口，也是一种引用类型。作为参数类型，可以把String对象传递到方法中。
        boolean b = str.contains("b");
        System.out.println(b);
    }

    /**
     关于 static 关键字的使用，它可以用来修饰的成员变量和成员方法，被修饰的成员是属于类的，
     而不是单单是属 于某个对象的。也就是说，既然属于类，就可以不靠创建对象来调用了。
     1.静态方法可以直接访问类变量和静态方法。
     2.静态方法不能直接访问普通成员变量或成员方法。反之，成员方法可以直接访问类变量或静态方法。
     3.静态方法中，不能使用this关键字。
     **静态方法只能访问静态成员
     */
    /**
    静态代码块的格式是：
    public class 类名称 {
        static {
            // 静态代码块的内容
        }
    }
    特点：当第一次用到本类时，静态代码块执行唯一的一次。
    静态内容总是优先于非静态，所以静态代码块比构造方法先执行。

    静态代码块的典型用途：
    用来一次性地对静态成员变量进行赋值。
     */

    @Test
    public void MathsTest(){
    /**
    java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。
    public static double abs(double num)：获取绝对值。有多种重载。
    public static double ceil(double num)：向上取整。
    public static double floor(double num)：向下取整。
    public static long round(double num)：四舍五入。
    Math.PI代表近似的圆周率常量（double）。
     */

        // 获取绝对值
        System.out.println(Math.abs(3.14)); // 3.14
        System.out.println(Math.abs(0)); // 0
        System.out.println(Math.abs(-2.5)); // 2.5
        System.out.println("================");

        // 向上取整
        System.out.println(Math.ceil(3.9)); // 4.0
        System.out.println(Math.ceil(3.1)); // 4.0
        System.out.println(Math.ceil(3.0)); // 3.0
        System.out.println("================");

        // 向下取整，抹零
        System.out.println(Math.floor(30.1)); // 30.0
        System.out.println(Math.floor(30.9)); // 30.0
        System.out.println(Math.floor(31.0)); // 31.0
        System.out.println("================");

        //四舍五入
        System.out.println(Math.round(20.4)); // 20
        System.out.println(Math.round(10.5)); // 11

        double pi = Math.PI;
        System.out.println(pi);
    }

}
