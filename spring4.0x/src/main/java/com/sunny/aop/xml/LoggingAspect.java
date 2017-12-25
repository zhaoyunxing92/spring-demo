package com.sunny.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;
import java.util.List;

/**
 * @author sunny
 * @className com.sunny.aop.LoggingA
 * @date 2017-12-24 00:00
 * @description:  使用xml配置
 */

public class LoggingAspect {

    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());

        System.out.println("the method [ " + methodName + " ] begins with" + args);
    }


    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();

        System.out.println("the method [ " + methodName + " ] end");
    }


    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();

        System.out.println("the method [ " + methodName + " ] end with " + result);
    }


    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();

        System.out.println("the method [ " + methodName + " ] occurs exception " + ex);
    }
    
    public Object aroundMethod(ProceedingJoinPoint pjd) {
        Object result = null;

        String methodName = pjd.getSignature().getName();

        try {
            //前置通知
            System.out.println("the aroundMethod method [ " + methodName + " ] begigs with " + Arrays.asList(pjd.getArgs()));
            //执行目标方法
            result = pjd.proceed();
            //后置通知
        } catch (Throwable throwable) {
            //异常通知
            throwable.printStackTrace();
        }
        //后置通知

        return result;
    }
}

