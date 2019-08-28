package io.xiun.springboot.web.controller;

import io.xiun.springboot.test1.service.UserServiceImpl;
import io.xiun.springboot.test2.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class MutiDatasourceController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private CustomerServiceImpl customerService;

    //Logger logger = Logger.getLogger(MutiDatasourceController.class);


    @RequestMapping("register")
    @ResponseBody
    public String register(String username, String password) {

        //logger.info("===:username:" + username + " password:" + password);


        userService.save(username, password);

        //customerService.save(username, "15933612125");
        return "success";
    }


}
