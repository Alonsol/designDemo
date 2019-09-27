package com.alonsol.demo.design.explaindemo.demo2;

public class SubstractionExpression extends OperatorExpression {

    public SubstractionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() - exp2.interpret();
    }
}
