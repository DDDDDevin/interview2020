package com.atguigu.day02test;

/**
 * 代码块：先出现的先加载；
 * new出一个对象默认调用无参构造方法；
 *      普通代码块{} 执行顺序优先于构造方法  !!
 * static静态代码块 永远是最先加载的，且只加载一次；
 */
public class CodeBlock02 {
    {
        System.out.println("代码块-333");
    }

    public CodeBlock02() {
        System.out.println("构造方法-222");
    }

    {
        System.out.println("代码块-111");
    }

    public static void main(String[] args) {
        new CodeBlock02(); // 3 1 2
        System.out.println("**************************");
        new CodeBlock02(); //3 1 2
    }
}
