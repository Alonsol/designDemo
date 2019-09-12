package com.alonsol.demo.mediatordemo.demo1;

public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueA将信息递交给中介者处理");
    }
}
