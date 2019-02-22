package com.ecpss.auto.InterfaceT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xc on 2019/2/19.
 */
public class TestAuto {
    public static void main(String[]  args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springmybatis.xml");
         BookService bookService = context.getBean(com.ecpss.auto.InterfaceT.BookService.class);
        bookService.add();//add......
    }
}
