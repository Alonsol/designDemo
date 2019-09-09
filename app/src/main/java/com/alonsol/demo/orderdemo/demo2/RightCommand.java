package com.alonsol.demo.orderdemo.demo2;

public class RightCommand implements Command {

    private TetrisMachine machine;


    public RightCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toRight();
    }
}
