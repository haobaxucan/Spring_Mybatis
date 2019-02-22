package com.ecpss.Service;

import com.ecpss.one.Person;
import com.ecpss.one.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xc on 2019/2/18.
 */


public class HelloService implements UserService{
    @Autowired
    private PersonMapper personMapper;
    @Override
    public void add(Person p) {
        personMapper.add(p);
    }
}
