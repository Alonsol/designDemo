package com.alonsol.demo.orderdemo.demo2;

public class LeftCommand implements Command {

    //持有一个接收者俄罗斯方块游戏对象引用
    private TetrisMachine machine;

    public LeftCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        //调用游戏机里的具体方法执行操作
        machine.toLeft();
    }
}
