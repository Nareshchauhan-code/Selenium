package com.selenium;

import java.lang.reflect.Method;

public class ReflectionAPI {

    public static void main(String[] args) {

        TestDemo ts = new TestDemo();

        Class clazz = ts.getClass();

        System.out.println(clazz.getName());
        Method[] arr = clazz.getMethods();

        for (Method methodName:arr){

            System.out.println(methodName.getName());
        }


    }
}
