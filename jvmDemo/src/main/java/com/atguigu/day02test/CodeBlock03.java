package com.atguigu.day02test;

class Code{
    public Code() {
        System.out.println("Code的构造方法111");
    }
    {
        System.out.println("Code的代码块222");
    }
    static {
        System.out.println("Code的静态代码块333");
    }
}
public class CodeBlock03 {
    {
        System.out.println("CodeBlock03 的构造方法块444");
    }
    static {
        System.out.println("CodeBlock03 的静态方法块555");
    }

    public CodeBlock03() {
        System.out.println("CodeBlock03的构造方法块666");
    }

    public static void main(String[] args) {
        System.out.println("CodeBlock03的main方法 777");
//        new Code();  // 5 7 3 2 1
        System.out.println("************************");
        new Code(); // 2 1
        System.out.println("************************");
        new CodeBlock03(); // 4 6
    }
}
