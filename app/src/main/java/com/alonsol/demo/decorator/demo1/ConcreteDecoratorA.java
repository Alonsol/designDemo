package com.alonsol.demo.decorator.demo1;

public class ConcreteDecoratorA extends Decorator {


    /**
     * 必要的构造方法，需要一个Component类型的对象
     *
     * @param component
     */
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        //装饰方法A和B既可以在付类方法前调用也可以在之后调用
        operatorA();
        super.operate();
        operatorB();
    }

    public void operatorA() {
        System.out.println("operatorA");
    }

    public void operatorB() {
        System.out.println("operatorB");
    }
}
