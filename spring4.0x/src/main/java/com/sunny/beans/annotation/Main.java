package com.sunny.beans.annotation;

import com.sunny.beans.annotation.controller.UserController;
import com.sunny.beans.annotation.repository.UserRepository;
import com.sunny.beans.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunny
 * @className com.sunny.beans.annotation.Main
 * @date 2017-12-22 15:51
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
        UserController userController = (UserController) ctx.getBean("userController");
        userController.execute();
        System.out.println(userController);


        UserService userService = (UserService) ctx.getBean("userService");
        System.out.println(userService);

        UserRepository userRepository = (UserRepository) ctx.getBean("userRepositoryImpl");
        System.out.println(userRepository);

        // @Inject
        // @Resource
        // @Autowired
        


    }
}
