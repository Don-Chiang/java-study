package com.javaee.basis.notes.firststage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
创建对象的标准格式：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
new 类名称();

注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象。
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JavaApiNote05 {

    @Test
    public  void scaner() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
    }

    @Test
    public  void random01() {
        /**1. 使用
        获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
        获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
        实际上代表的含义是：[0,3)，也就是0~2
         */
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int v = r.nextInt(6)+1000;
            System.out.println(v);
        }
    }

    /**
    题目要求：
    根据int变量n的值，来获取随机数字，范围是[1,n]，可以取到1也可以取到n。

    思路：
    1. 定义一个int变量n，随意赋值
    2. 要使用Random：三个步骤，导包、创建、使用
    3. 如果写10，那么就是0~9，然而想要的是1~9，可以发现：整体+9即可。
    4. 打印随机数字
     */
    @Test
    public  void random02() {
        /*Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int v = r.nextInt(10)+9;
            System.out.println(v);
        }*/
        //6位数验证码
        Random random = new Random();
        String result = "";
        for (int i = 0; i < 6; i++) {
            result += random.nextInt(10);
        }
        System.out.println(result);
    }

    /**
    题目：
    用代码模拟猜数字的小游戏。
    思路：
    1. 首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
    2. 需要键盘输入，所以用到了Scanner
    3. 获取键盘输入的数字，用Scanner当中的nextInt方法
    4. 已经得到了两个数字，判断（if）一下：
        如果太大了，提示太大，并且重试；
        如果太小了，提示太小，并且重试；
        如果猜中了，游戏结束。
    5. 重试就是再来一次，循环次数不确定，用while(true)。
     */
    @Test
    public  void random03() {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1; // [1,100]
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt(); // 键盘输入猜测的数字

            if (guessNum > randomNum) {
                System.out.println("太大了，请重试。");
            } else if (guessNum < randomNum) {
                System.out.println("太小了，请重试。");
            } else {
                System.out.println("恭喜你，猜中啦！");
                break; // 如果猜中，不再重试
            }
        }

        System.out.println("游戏结束。");
    }
    @Test
    public  void arrayList() {
    /**ArrayList对象不能存储基本类型，只能存储引用类型的数据。类似 <int> 不能写，但是存储基本数据类型对应的
        包装类型是可以的。所以，想要存储基本类型数据， <> 中的数据类型，必须转换后才能编写
     */

        ArrayList<Integer> arrayList = new ArrayList<>();
    }
}
