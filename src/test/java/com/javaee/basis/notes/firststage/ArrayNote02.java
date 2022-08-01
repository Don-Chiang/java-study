package com.javaee.basis.notes.firststage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;


@SpringBootTest
@RunWith(SpringRunner.class)
public class ArrayNote02 {

    /**
    数组的概念：是一种容器，可以同时存放多个数据值。

    数组的特点：
    1. 数组是一种引用数据类型
    2. 数组当中的多个数据，类型必须统一
    3. 数组的长度在程序运行期间不可改变

    数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值。

    两种常见的初始化方式：
    1. 动态初始化（指定长度）
    2. 静态初始化（指定内容）

    动态初始化数组的格式：
    数据类型[] 数组名称 = new 数据类型[数组长度];
    静态初始化基本格式：
    标准格式：
        数据类型[] 数组名称 = new 数据类型[] { 元素1, 元素2, ... };
        省略格式：
        数据类型[] 数组名称 = { 元素1, 元素2, ... };
    */
    @Test
    public void demo01() {
        int[] arr = {1, 2, 3, 4, 5};
        // 为0索引元素赋值为6
        arr[0] = 6;
        //获取数组0索引上的元素
        int i = arr[0];
        System.out.println(i);
        //直接输出数组0索引元素
        System.out.println(arr[0]);
        ArrayList<String> objects = new ArrayList<>();
    }
}
