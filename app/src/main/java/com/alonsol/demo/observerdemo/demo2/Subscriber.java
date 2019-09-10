package com.alonsol.demo.observerdemo.demo2;


import org.simple.eventbus.EventType;
import org.simple.eventbus.ThreadMode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Subscriber {

    /**
     * 事件tag，类似于BroadcastReceiver中的action，事件的标识符
     *
     * @return
     */
    String tag() default EventType.DEFAULT_TAG;


    ThreadMode mode() default ThreadMode.MAIN;
}
