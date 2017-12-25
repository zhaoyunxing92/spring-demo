package com.sunny.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author sunny
 * @className com.sunny.aop.ValidationAspect
 * @date 2017-12-25 11:11
 * @description:
 */
@Aspect
@Component
@Order(1)  //指定aop优先级，值越小优先级越高
public class ValidationAspect {

    @Before(value = "execution(* com.sunny.aop.*.*(int ,int ))")
    public void validateArgs(JoinPoint joinPoint) {
        System.out.println("validate:" + Arrays.asList(joinPoint.getArgs()));
    }
}
