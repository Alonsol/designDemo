package com.alonsol.demo.flyweight.demo1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {

    static Map<String, Ticket> sTicketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "=" + to;
        if (sTicketMap.containsKey(key)) {
            System.out.println("使用缓存==>" + key);
            return sTicketMap.get(key);
        } else {
            System.out.println("创建对象==>" + key);
            TrainTicket ticket = new TrainTicket(from, to);
            sTicketMap.put(key, ticket);
            return ticket;
        }
    }
}
