package com.alonsol.demo.design.bridgepattern.demo2;

public class Client {

    public static void main(String[] args) {
        //原汁原味
        Ordinary implOrdinary = new Ordinary();

        //准备糖类
        Sugar implSugar = new Sugar();

        //大杯咖啡 原为
        LargeCoffee largeCoffeeOrdinary = new LargeCoffee(implOrdinary);
        largeCoffeeOrdinary.makeCoffee();

        //小杯咖啡 原味、
        SmallCoffee smallCoffeeOridinary = new SmallCoffee(implOrdinary);
        smallCoffeeOridinary.makeCoffee();

        //大杯咖啡 加糖
        LargeCoffee largeCoffeeSugar = new LargeCoffee(implSugar);
        largeCoffeeSugar.makeCoffee();

        //小杯咖啡 加糖
        SmallCoffee smallCoffeeSugar = new SmallCoffee(implSugar);
        smallCoffeeSugar.makeCoffee();

        //中杯原味
        MiddleCoffee middleCoffeeOrdinary = new MiddleCoffee(implOrdinary);
        middleCoffeeOrdinary.makeCoffee();

        //中杯咖啡 加糖
        MiddleCoffee middleCoffeeSugar = new MiddleCoffee(implSugar);
        middleCoffeeSugar.makeCoffee();

    }
}
