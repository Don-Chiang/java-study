package com.javaee.basis.model;

/**
 构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法。
 格式：
 public 类名称(参数类型 参数名称) {
 方法体
 }

 注意事项：
 1. 构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样
 2. 构造方法不要写返回值类型，连void都不写
 3. 构造方法不能return一个具体的返回值
 4. 如果没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，没有参数、方法体什么事情都不做。
 public Student() {}
 5. 一旦编写了至少一个构造方法，那么编译器将不再赠送。
 6. 构造方法也是可以进行重载的。
 重载：方法名称相同，参数列表不同。

注意事项：
1. 成员变量是直接定义在类当中的，在方法外边。
2. 成员方法不要写static关键字。
 */

public class Student {

    // 成员变量
    String name; // 姓名
    int age; // 姓名

    // 成员方法
    public void eat() {
        System.out.println("吃饭饭！");
    }

    public void sleep() {
        System.out.println("睡觉觉！");
    }

    public void study() {
        System.out.println("学习！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
