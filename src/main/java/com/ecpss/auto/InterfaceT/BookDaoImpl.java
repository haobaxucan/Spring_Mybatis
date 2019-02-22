package com.ecpss.auto.InterfaceT;

import org.springframework.stereotype.Repository;

/**
 * Created by xc on 2019/2/19.
 */
@Repository("bookDao1")
public class BookDaoImpl implements BookDao{
    @Override
    public void add() {
        System.out.println("add......");
    }
}
