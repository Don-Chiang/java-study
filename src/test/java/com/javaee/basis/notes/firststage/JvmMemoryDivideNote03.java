package com.javaee.basis.notes.firststage;

public class JvmMemoryDivideNote03 {

    /**
     * Java的内存需要划分成为5个部分∶
     * 1.栈（Stack）∶存放的都是方法中的局部变量。方法的运行一定要在栈当中运行。
     * 局部变量∶方法的参数，或者是方法{内部的变量作用域∶一旦超出作用域，立刻从栈内存当中消失。
     * 2.堆（Heap）∶ 凡是new出来的东西，都在堆当中。
     * 堆内存里面的东西都有一个地址值∶ 16进制
     * 堆内存里面的数据，都有默认值。规则∶
     *      如果是浮点数 默认为0.0
     *      如果是字符默认为'\u0000'
     *      如果是布尔默认为false
     *      如果是引用类型 默认为null
     * 3.方法区（Method Area）∶存储.class相关信息，包含方法的信息。
     * 4.本地方法栈（Native Method Stack）∶与操作系统相关。
     * 5.寄存器（pc Rgister）∶与CPU相关。
     */

    /**
    数组元素的反转：
    本来的样子：[1, 2, 3, 4]
    之后的样子：[4, 3, 2, 1]
    要求不能使用新数组，就用原来的唯一一个数组。
     */
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };

        // 遍历打印数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============");

        /**
        初始化语句：int min = 0, max = array.length - 1
        条件判断：min < max
        步进表达式：min++, max--
        循环体：用第三个变量倒手
         */
        int a =1;
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
            a+=1;
        }
        System.out.println(a);
        // 再次打印遍历输出数组后来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-------------------------");
        printArray(array);
    }

    //1.数组作为方法参数传递，传递的参数是数组内存的地址
    //2.数组作为方法的返回值，返回的是数组的内存地址
    //3.方法的参数为基本类型时,传递的是数据值. 方法的参数为引用类型时,传递的是地址值
    private static int[] printArray(int[] array){

        System.out.println(array);

        return array;
    }


}
