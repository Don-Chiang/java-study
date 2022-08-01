package com.javaee.basis.notes.firststage;

//final关键字
/**
 * 1.基本类型的局部变量，被final修饰后，只能赋值一次，不能再更改
 * 2.引用类型的局部变量，被final修饰后，只能指向一个对象，地址不能再更改。但是不影响对象内部的成员变量值的 修改
 */

/**
 * Java中有四种权限修饰符：
 *                     public  >   protected   >   (default)   >   private
 * 同一个类（我自己）        YES         YES             YES             YES
 * 同一个包（我邻居）        YES         YES             YES             NO
 * 不同包子类（我儿子）       YES         YES             NO              NO
 * 不同包非子类（陌生人）      YES         NO              NO              NO
 *
 * 注意事项：(default)并不是关键字“default”，而是根本不写。
 */

//内部类

import com.javaee.basis.model.innerclass.MyInterface;

/**
 * 如何使用成员内部类？有两种方式：
 * 1. 间接方式：在外部类的方法当中，使用内部类；然后main只是调用外部类的方法。
 * 2. 直接方式，公式：
 * 类名称 对象名 = new 类名称();
 * 【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】
 *
 * 如果一个类是定义在一个方法内部的，那么这就是一个局部内部类。
 * “局部”：只有当前所属的方法才能使用它，出了这个方法外面就不能用了。
 *
 * 小节一下类的权限修饰符：
 * public > protected > (default) > private
 * 定义一个类的时候，权限修饰符规则：
 * 1. 外部类：public / (default)
 * 2. 成员内部类：public / protected / (default) / private
 * 3. 局部内部类：什么都不能写
 */
public class InnerClassAndFinalNote08 {

    public static void main(String[] args) {
        //匿名内部类
        /**
        如果接口的实现类（或者是父类的子类）只需要使用唯一的一次，
        那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】。

        匿名内部类的定义格式：
        接口名称 对象名 = new 接口名称() {
            // 覆盖重写所有抽象方法
        };

        对格式“new 接口名称() {...}”进行解析：
        1. new代表创建对象的动作
        2. 接口名称就是匿名内部类需要实现哪个接口
        3. {...}这才是匿名内部类的内容

        另外还要注意几点问题：
        1. 匿名内部类，在【创建对象】的时候，只能使用唯一一次。
        如果希望多次创建对象，而且类的内容一样的话，那么就需要使用单独定义的实现类了。
        2. 匿名对象，在【调用方法】的时候，只能调用唯一一次。
        如果希望同一个对象，调用多次方法，那么必须给对象起个名字。
        3. 匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
        强调：匿名内部类和匿名对象不是一回事！！！
         */

        // 使用匿名内部类，但不是匿名对象，对象名称就叫objA
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法！111-A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！222-A");
            }
        };
        objA.method1();
        objA.method2();
        System.out.println("=================");
    }
}
