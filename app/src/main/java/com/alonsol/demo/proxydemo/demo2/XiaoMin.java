package com.alonsol.demo.proxydemo.demo2;


/**
 * 具体诉讼人
 */
public class XiaoMin implements ILawsuit {


    @Override
    public void submit() {
        //老板欠小明工资，小明只好申请仲裁
        System.out.println("老板拖欠工资，特此申请仲裁");
    }

    @Override
    public void burden() {
        //小明证据充足，不拍搞不赢
        System.out.println("这是合同书和过去一年的银行工资流水！");
    }

    @Override
    public void defend() {
        //铁证如山，辩护也没什么好说的
        System.out.println("证据确凿，不需要在说什么了！");
    }

    @Override
    public void finish() {
        //结果也是肯定的，必赢
        System.out.println("诉讼成功！，判断老板即日起七天内结算工资");
    }
}
