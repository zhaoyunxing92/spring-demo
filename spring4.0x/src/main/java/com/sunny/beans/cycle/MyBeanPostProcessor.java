package com.sunny.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author sunny
 * @className com.sunny.beans.cycle.MyBeanPostProcessor
 * @date 2017-12-22 13:53
 * @description:  bean 的后置处理器 处理全部的bean
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization:" + bean + "，" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization:" + bean + "，" + beanName);
        return bean;
    }
}
