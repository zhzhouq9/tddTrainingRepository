package com.iss.tdd;

/**
 * @author zhzhouq
 * @date 2020-10-20 - 22:06
 */

/**
 * 类名称: test1
 * 类描述：TDD练功房-test1
 * 创建时间: 2020-10-20 22:06
 * 创建人： zhzhouq
 * 版本： 1.0
 */
public class FizzBuzz {
//    ✏️今天的任务
//    写一个程序，打印出从1到100的数字，将其中3的倍数替换成“Fizz”，5的倍数替换成“Buzz”。
//    既能被3整除、又能被5整除的数则替换成“FizzBuzz”。
//    要求：每行代码都必须有单元测试覆盖。

    public void FizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                print((i % 5 == 0) ? "FizzBuzz\n" : "Fizz\n");
            } else if (i % 5 == 0) {
                print("Buzz\n");
            } else {
                print("i" + i + "\n");
            }
        }
    }

    public void print(String msg) {
        System.out.println(msg);
    }
}