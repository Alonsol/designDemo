package com.alonsol.demo.design.iteratordemo.demo1;

public class Client {

    public static void main(String[] args) {

        Aggregate<String> list = new ConcreteAggegate<>();

        list.add("haha");
        list.add("xixi");
        list.add("gaga");
        list.add("hehe");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
