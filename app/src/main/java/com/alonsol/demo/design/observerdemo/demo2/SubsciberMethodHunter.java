package com.alonsol.demo.design.observerdemo.demo2;


import org.simple.eventbus.EventType;
import org.simple.eventbus.Subscription;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class SubsciberMethodHunter {

    /**
     * the event bus's subcriber's map
     */
    Map<EventType, CopyOnWriteArrayList<Subscription>> mSubcriberMap;


    /**
     * @param subscriberMap subcriberMap
     */
    public SubsciberMethodHunter(Map<EventType, CopyOnWriteArrayList<Subscription>> subscriberMap) {
        mSubcriberMap = subscriberMap;
    }

    public void findSubcribeMethods(Object subscriber) {
        if (mSubcriberMap == null) {
            throw new NullPointerException("the mSubcriberMap is null");
        }

        Class<?> clazz = subscriber.getClass();
        //查找类中符合要求的注册方法，知道Object类
        while (clazz != null && !isSystemClass(clazz.getName())) {
            final Method[] allMethods = clazz.getDeclaredMethods();
            for (int i = 0; i < allMethods.length; i++) {
                Method method = allMethods[i];
                //根据注解来解析函数
                Subscriber annotation = method.getAnnotation(Subscriber.class);
                if (annotation != null) {
                    //获取方法参数
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    //订阅函数支持支一个参数
                    if (parameterTypes != null && parameterTypes.length == 1) {
                        Class<?> paramType = converType(parameterTypes[0]);
                        EventType eventType = new EventType(paramType, annotation.tag());
                    }
                }
            }
        }
    }

    private Class<?> converType(Class<?> eventType) {
        Class<?> returnClass = eventType;
        if (eventType.equals(boolean.class)) {
            returnClass = Boolean.class;
        } else if (eventType.equals(int.class)) {
            returnClass = Integer.class;
        } else if (eventType.equals(float.class)) {
            returnClass = Float.class;
        } else if (eventType.equals(double.class)) {
            returnClass = Double.class;
        }
        return returnClass;
    }

    private boolean isSystemClass(String name) {
        return name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.");
    }

}
