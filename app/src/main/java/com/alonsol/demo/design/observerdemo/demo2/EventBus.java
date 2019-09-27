package com.alonsol.demo.design.observerdemo.demo2;

import org.simple.eventbus.EventType;
import org.simple.eventbus.SubsciberMethodHunter;
import org.simple.eventbus.Subscription;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class EventBus {

    /**
     * 订阅map
     */
    private final Map<EventType, CopyOnWriteArrayList<Subscription>> mSubcriberMap = new ConcurrentHashMap<>();


    SubsciberMethodHunter mMethodHunter = new SubsciberMethodHunter(mSubcriberMap);

    /**
     * 注册订阅对象
     * @param subscriber
     */
    public void register(Object subscriber) {
        if (subscriber == null) {
            return;
        }
        synchronized (this) {
            mMethodHunter.findSubcribeMethods(subscriber);
        }
    }

}
