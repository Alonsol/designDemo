package com.alonsol.demo.design.decorator.demo1;


/**
 * 抽象装饰者
 */
public class Decorator extends Component {

    private Component component;//持有一个Component对象的引用


    /**
     * 必要的构造方法，需要一个Component类型的对象
     * @param component
     */
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
