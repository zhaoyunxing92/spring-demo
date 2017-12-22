package com.sunny.beans.annotation.controller;

import com.sunny.beans.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author sunny
 * @className com.sunny.beans.annotation.controller.UserController
 * @date 2017-12-22 15:46
 * @description:
 */
@Controller
public class UserController {
    // @Inject
    // @Resource
    @Autowired
    private UserService userService;

    public void execute() {
        userService.add();
        System.out.println("UserController execute ...");
    }
}
