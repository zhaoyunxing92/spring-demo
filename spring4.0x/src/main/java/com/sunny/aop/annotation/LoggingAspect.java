package com.sunny.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
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
@Order(2)  //指定aop优先级
public class LoggingAspect {
    /**
     * 定义一个方法用于声明切入点表达式
     */
    @Pointcut("execution(* com.sunny.aop.*.*.*(int ,int ))")
    public void declareJointPointExpression() {

    }


    //前置通知：目标方法开始前执行
    @Before("declareJointPointExpression()")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());

        System.out.println("the method [ " + methodName + " ] begins with" + args);
    }

    // 后置通知：目标方法执行后执行（无论是否异常）
    // 不能访问目标方法的返回结果
    @After(value = "execution(* com.sunny.aop.*.*.*(*,*))")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();

        System.out.println("the method [ " + methodName + " ] end");
    }

    //返回通知 : 在方法正常结束后执行的代码
    //返回通知是可以访问到目标方法返回的结果
    @AfterReturning(value = "execution(* com.sunny.aop.*.*.*(int ,int ))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();

        System.out.println("the method [ " + methodName + " ] end with " + result);
    }

    //异常通知: 在方法出现异常时会执行的代码
    // 可以访问到异常对象，而且可以指定处理的异常类
    @AfterThrowing(value = "execution(* com.sunny.aop.*.*.*(int ,int ))", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();

        System.out.println("the method [ " + methodName + " ] occurs exception " + ex);
    }

    //环绕通知: 需要携带 ProceedingJoinPoint 类型的参数
    // 类似于动态代理的全过程， ProceedingJoinPoint 类型的参数可以决定是否执行该目标方法
    // 且环绕通知必须有返回值，返回值即为目标方法的返回值
    @Around(value = "execution(* com.sunny.aop.*.*.*(int ,int ))")
    public Object aroundMethod(ProceedingJoinPoint pjd) {
        Object result = null;

        String methodName = pjd.getSignature().getName();

        try {
            //前置通知
            System.out.println("the method [ " + methodName + " ] begigs with " + Arrays.asList(pjd.getArgs()));
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

