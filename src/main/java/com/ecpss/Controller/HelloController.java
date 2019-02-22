package com.ecpss.Controller;

import com.ecpss.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xc on 2019/2/18.
 */
@Controller

public class HelloController {
    @Autowired
    public UserService userService;
    @RequestMapping("/aa")
    public String aa(){
        
        return "a";
    }
}
