package com.ecpss.one;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Reader;

/**
 * Created by xc on 2019/1/25.
 */
public class M {
    public static void main(String[] args) throws Exception{
        
        ApplicationContext context=new ClassPathXmlApplicationContext("springmybatis.xml");
        PersonMapper userMapper = (PersonMapper) context.getBean("personMapper");
        userMapper.add(new Person("xssssasaac",12));
    
    }
}
