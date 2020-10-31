package com.atguigu.day02test;

public class CodeBlock {
    public static void main(String[] args) {
        int x2 =10;
        System.out.println("main方法内的变量 x2 = " + x2);

        {
            int x = 11;
            System.out.println("普通代码块内的变量 x = " + x);
        }
        System.out.println();

        {
            int y = 13;
            System.out.println("普通代码块内的变量 y = " + y);
        }
        System.out.println();

        int x =12;
        System.out.println("main方法内的变量 x = " + x);

        System.out.println("预估结果 ：====10，11， 13 ，12");
    }
}
