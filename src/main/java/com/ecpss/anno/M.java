package com.ecpss.anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by xc on 2019/2/13.
 */
public class M {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.ecpss.anno.TestMethod");
        Annotation[] annotations = c.getAnnotations();
        for(Annotation annotation: annotations){
            System.out.println(annotation.annotationType());//interface com.ecpss.anno.MyAnnotation
        }
        
        Method[] declaredMethods = c.getDeclaredMethods();
        Method m = c.getDeclaredMethod("aa", null);
        //获取该注解吗，进而获取注解的值

        MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);
        System.out.println("值域"+annotation.value());
        System.out.println(m.getName());
    }
}
