package com.ecpss.auto.InterfaceT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xc on 2019/2/19.
 */
@Service("aa")
public class BookServiceImpl implements BookService{
    @Autowired
    BookDao bookDao2;
    @Override
    public void add() {
        bookDao2.add();
    }
}
