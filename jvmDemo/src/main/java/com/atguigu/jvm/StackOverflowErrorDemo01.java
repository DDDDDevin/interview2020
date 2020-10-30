package com.atguigu.jvm;

public class StackOverflowErrorDemo01 {
    private static final String NUMBER="7";

    /**
     * 栈溢出错误03
     * Exception in thread "main" java.lang.StackOverflowError
     */
    public static void test1(){
//        test2();
        test1();
        System.out.println("test1() end!");
    }
    public static void test2(){
        System.out.println("test2() end!");
    }
    public static void main(String[] args) {
        test1();
        System.out.println("main() end!");
    }
}
