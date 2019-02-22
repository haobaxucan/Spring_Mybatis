package com.ecpss.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xc on 2019/2/19.
 */

public class TestAuto {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("users.xml");
        BookService bookService = context.getBean(BookService.class);
//        bookServic
    }
}
