package com.alonsol.demo.mediatordemo.demo1;

public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueB将信息递交给中介者处理");
    }
}
