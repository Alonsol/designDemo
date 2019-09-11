package com.alonsol.demo.vistordemo.demo1;

public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + ", KPI:" + engineer.kpi);
    }

    @Override
    public void visit(Manager leader) {
        System.out.println("经理：" + leader.name + ",KPI :" + leader.kpi + ",新产品数量：" + leader.getProducts());
    }
}
