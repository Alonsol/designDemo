package com.alonsol.demo.orderdemo.demo2;

public class Buttons {

    private LeftCommand leftCommand;//向左移动的命令对象引用
    private RightCommand rightCommand;//向右移动的命令对象引用
    private FallCommand fallCommand;//快速落下的命令对象引用
    private TransformCommand transformCommand;//变换形状的命令对象引用

    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    public void setTransformCommand(TransformCommand transformCommand) {
        this.transformCommand = transformCommand;
    }

    public void toLeft() {
        leftCommand.execute();
    }

    public void toRight() {
        rightCommand.execute();
    }

    public void fall() {
        fallCommand.execute();
    }

    public void transform() {
        transformCommand.execute();
    }

}
