package com.ecpss.anno;

/**
 * Created by xc on 2019/2/13.
 */
@MyAnnotation
public class TestMethod {
    @MyAnnotation(value = "cc")
    public void aa(){
        System.out.println("ccc");
    }
    
}
