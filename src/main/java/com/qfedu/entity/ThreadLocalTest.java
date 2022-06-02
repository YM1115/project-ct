package com.qfedu.entity;

import javax.naming.Name;
import java.sql.SQLOutput;

/**
 * ClassName:ThreadLocalTest
 * date：2022/5/16 22:19
 *
 * @author：YM start
 * @since:JDK 1.8
 * Description:
 */
public class ThreadLocalTest {
    private String name = "张三";
    private int age = 18;
    private String desc = "努力奋斗";
    static ThreadLocal threadLocal = new ThreadLocal();
    static ThreadLocal threadLocal1 = new ThreadLocal();

    public static void main(String[] args) {
//        threadLocal.set("zhangsan");
//        threadLocal1.set("yuansi");
//        System.out.println(threadLocal.get());
//        System.out.println(threadLocal1.get());

      // \u000d System.out.println("123");
    }
}
