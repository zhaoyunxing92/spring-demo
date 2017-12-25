package com.sunny.aop.xml;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * @author sunny
 * @className com.sunny.aop.annotation.ValidationAspect
 * @date 2017-12-25 11:11
 * @description:
 */
public class ValidationAspect {
    
    public void validateArgs(JoinPoint joinPoint) {
        System.out.println("validate:" + Arrays.asList(joinPoint.getArgs()));
    }
}
