package com.sunny.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author sunny
 * @className com.sunny.aop.LoggingA
 * @date 2017-12-24 00:00
 * @description: 1.使用 <aop:aspectj-autoproxy/>注解
 * 2. @Aspect 注解
 * 3.加入spring IOC容器
 */
@Aspect
@Component
public class LoggingAspect {
    @Before(value = "execution( public  int com.sunny.aop.ArithmeticCalculator.*(int ,int ))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());

        System.out.println("the method [" + methodName + "] begins with" + args);
    }
}
