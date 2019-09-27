package com.alonsol.demo.design.decorator.demo1;


/**
 * 组件具体实现类
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("ConcreteComponent operate");
    }
}
