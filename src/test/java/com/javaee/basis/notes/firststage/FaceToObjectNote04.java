package com.javaee.basis.notes.firststage;



import com.javaee.basis.model.Student;

/**
 *
 面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理每一个细节。---之前
 面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮我做事儿。 ---现在

 区别:
    面向过程：强调步骤。 ---自己洗衣服
    面向对象：强调对象。 ---找个洗衣机洗衣服。
 特点:
     面向对象思想是一种更符合我们思考习惯的思想，它可以将复杂的事情简单化，并将我们从执行者变成了指挥者。
     面向对象的语言中，包含了三大基本特征，即封装、继承和多态。

 封装性在Java当中的体现：
 1. 方法就是一种封装
 2. 关键字private也是一种封装

 封装就是将一些细节信息隐藏起来，对于外界不可见。
关键字:
    this代表所在类的当前对象的引用（地址值），即对象自己的引用,谁调用方法谁就是this
 */
public class FaceToObjectNote04 {
    public static void main(String[] args) {
        //1.学生对象
        Student one = new Student();
        //2.new 出来的对象都保存在<堆内存>当中 ,对象的.class文件保存在<方法区>当中,对象中的放方法保存的是一个地址值
        //3.方法运行在<栈内存>当中
        //4. 1方法运行<栈>--->2找到<堆>中Student的地址值--->3拿方法区 eat() 的地址值 --->4eat()运行进栈--->5运行完出栈
        one.eat();

        Student two;
        String str;
        System.out.println(one.getName());

    }
}
