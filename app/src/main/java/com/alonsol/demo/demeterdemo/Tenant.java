package com.alonsol.demo.demeterdemo;


/**
 * 租户
 */
public class Tenant {

    public float roomArea;

    public float roomPrice;

    public static final float diffPrice = 100.0001f;
    public static final float diffArea = 0.00001f;

    public void rentRoom(Mediator mediator) {
        System.out.println("租到房了" + mediator.rentOut(roomArea, roomPrice));
    }

}
