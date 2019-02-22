package com.ecpss.auto;

import org.springframework.stereotype.Repository;

/**
 * Created by xc on 2019/2/19.
 */
@Repository
public class BookDao {
    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao [lable=" + lable + "]";
    }
}
