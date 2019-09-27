package com.alonsol.demo.design.factorydemo3;

public class Client {

    public static void main(String[] args) {
        AudiCarFactory factory = new AudiCarFactory();
        //生成Q3并启动
        AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
        audiQ3.drive();
        audiQ3.selfNavigation();

        //生产Q5并启动
        AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
        audiQ5.drive();
        audiQ5.selfNavigation();

        //生产Q7
        AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
        audiQ7.drive();
        audiQ7.selfNavigation();
    }
}
